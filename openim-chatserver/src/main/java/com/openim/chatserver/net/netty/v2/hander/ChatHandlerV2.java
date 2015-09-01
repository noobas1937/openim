package com.openim.chatserver.net.netty.v2.hander;

import com.openim.chatserver.ChannelUtil;
import com.openim.chatserver.net.netty.v2.INettyMessageHandlerV2;
import com.openim.common.im.bean.ExchangeMessage;
import com.openim.common.im.bean.MessageType;
import com.openim.common.im.bean.protbuf.ProtobufChatMessage;
import com.openim.common.im.codec.mq.MQBsonCodecUtilV2;
import com.openim.common.mq.IMessageSender;
import com.openim.common.mq.constants.MQConstants;
import io.netty.channel.Channel;
import io.netty.util.Attribute;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by shihuacai on 2015/7/22.
 */
@Component
public class ChatHandlerV2 implements INettyMessageHandlerV2 {

    private static final Logger LOG = LoggerFactory.getLogger(ChatHandlerV2.class);

    //private static final IMQCodec<ExchangeMessage> mqCodec = new MQBsonCodecUtilV2();

    @Autowired
    private IMessageSender messageSender;

    /*public ChatHandlerV2() {
        messageSender = ApplicationContextAware.getBean(IMessageSender.class);
    }*/

    @Override
    public void handle(Channel channel, ExchangeMessage exchangeMessage) {
        if (exchangeMessage.getType() == MessageType.CHAT) {
            try {
                Attribute<String> attribute = channel.attr(ChannelUtil.loginIdKey);

                ProtobufChatMessage.ChatMessage chatMessage = (ProtobufChatMessage.ChatMessage)exchangeMessage.getMessageLite();
                chatMessage = chatMessage.toBuilder().setFrom(attribute.get()).build();
                exchangeMessage.setMessageLite(chatMessage);
                messageSender.sendMessage(MQConstants.openimExchange, MQConstants.chatRouteKey, MQBsonCodecUtilV2.encode(exchangeMessage));
            }catch (Exception e){
                LOG.error(e.toString());
            }
        } else {
            LOG.error("数据类型错误: " + MQBsonCodecUtilV2.encode(exchangeMessage));
        }
    }
}