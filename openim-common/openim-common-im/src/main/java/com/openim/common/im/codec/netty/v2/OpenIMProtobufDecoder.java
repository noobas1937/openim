package com.openim.common.im.codec.netty.v2;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.MessageLite;
import com.openim.common.im.bean.ExchangeMessage;
import com.openim.common.im.containter.MessageTypeContainerV2;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by shihuacai on 2015/8/20.
 */
public class OpenIMProtobufDecoder extends ByteToMessageDecoder {

    private static final Logger LOG = LoggerFactory.getLogger(OpenIMProtobufDecoder.class);

    /*MessageLite messageLite;
    public OpenIMProtobufDecoder(MessageLite messageLite){
        this.messageLite = messageLite;
    }*/

    @Override
    public void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        in.markReaderIndex();
        final byte[] buf = new byte[5];
        for (int i = 0; i < buf.length; i ++) {
            if (!in.isReadable()) {
                in.resetReaderIndex();
                return;
            }

            buf[i] = in.readByte();
            if (buf[i] >= 0) {
                int length = CodedInputStream.newInstance(buf, 0, i + 1).readRawVarint32();
                if (length < 0) {
                    throw new CorruptedFrameException("negative length: " + length);
                }

                if (in.readableBytes() < length) {
                    in.resetReaderIndex();
                    return;
                } else {
                    byte msgType = in.readByte();
                    byte[] messageBody = new byte[length - 1];
                    in.readBytes(messageBody, 0, length - 1);

                    MessageLite messageLite = MessageTypeContainerV2.getMessageLite(msgType);
                    if(messageLite == null){
                        LOG.error("msgType:{}不存在", msgType);
                    }else{
                        ExchangeMessage exchangeMessage = new ExchangeMessage();
                        exchangeMessage.setType(msgType);
                        exchangeMessage.setMessageLite(messageLite.newBuilderForType().mergeFrom(messageBody).build());
                        out.add(exchangeMessage);
                    }
                }
            }
        }

        // Couldn't find the byte whose MSB is off.
        throw new CorruptedFrameException("length wider than 32-bit");
    }
}
