package com.openim.emulator.client.netty.v2;

import com.openim.common.im.bean.ExchangeMessage;
import com.openim.common.im.bean.MessageType;
import com.openim.common.im.bean.protbuf.ProtobufChatMessage;
import com.openim.common.im.bean.protbuf.ProtobufLoginMessage;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shihuacai on 2015/7/22.
 */
public class ChatClient {
    private final String host;
    private final int port;
    private CurrentOps currentOps = CurrentOps.login;

    private String user1 = "user1";
    private String user2 = "user2";

    private String currentUser = null;
    private String targetUser = null;

    public static final String SERVER_HOST = "localhost";
    public static final int SERVER_PORT = 9000;

    public ChatClient(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public static void main(String[] args) throws Exception {
        new ChatClient(SERVER_HOST, SERVER_PORT).run();
    }

    public void run() throws Exception {
        EventLoopGroup group = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap()
                    .group(group)
                    .channel(NioSocketChannel.class)
                    .handler(new ProtobufChatClientInitializer());
            Channel channel = bootstrap.connect(host, port).sync().channel();
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("为方便测试，默认两个用户:user1,user2，退出系统请输入quit");
            System.out.print("请输入登录名(user1或user2):");

            while (true) {
                String line = in.readLine();
                if(line != null && line.trim().length() > 0){
                    line = line.trim();
                    if(line.equals("quit")){
                        channel.close();
                        System.exit(0);
                        return;
                    }

                    if(currentOps == CurrentOps.login){
                        if(line.equals(user1) || line.equals(user2)){
                            currentUser = line;
                            String loginId = line;
                            ProtobufLoginMessage.LoginMessage connectMessage = ProtobufLoginMessage.LoginMessage.newBuilder().setLoginId(loginId).build();
                            ExchangeMessage exchangeMessage = new ExchangeMessage();
                            exchangeMessage.setType(MessageType.LOGIN);
                            exchangeMessage.setMessageLite(connectMessage);
                            channel.writeAndFlush(exchangeMessage);

                            targetUser = currentUser.equals(user1) ? user2 : user1;
                            //System.out.println("开始向" + targetUser + "发送消息");

                            currentOps = CurrentOps.chat;
                        }else{
                            System.out.println("登录用户只能为user1或user2");
                        }

                    }else if(currentOps == CurrentOps.chat){
                        ProtobufChatMessage.ChatMessage chatMessage = ProtobufChatMessage.ChatMessage.newBuilder().setMsg(line).setTo(targetUser).build();
                        ExchangeMessage exchangeMessage = new ExchangeMessage();
                        exchangeMessage.setType(MessageType.CHAT);
                        exchangeMessage.setMessageLite(chatMessage);
                        channel.writeAndFlush(exchangeMessage);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            group.shutdownGracefully();
        }
    }

    enum CurrentOps{
        login,
        chat
    }
}
