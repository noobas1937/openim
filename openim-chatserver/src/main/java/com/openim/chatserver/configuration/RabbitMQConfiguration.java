package com.openim.chatserver.configuration;

import com.openim.common.mq.rabbitmq.configuration.BaseRabbitMQConfiguration;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shihuacai on 2015/7/29.
 */
@Configuration
public class RabbitMQConfiguration extends BaseRabbitMQConfiguration /*extends BaseConfiguration*/ {

    @Bean
    Queue serverQueue(@Qualifier("chatServerListenerQueue")String chatServerListenerQueue) {
        /*String queueName = chatServerListenerQueue();
        return new Queue(queueName, true);*/
        return new Queue(chatServerListenerQueue, true);
    }

    /**
     * 采用该注解注入对象，方法名不能重名，否则存在一个不执行的情况
     *
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingChatServerQueue(DirectExchange exchange,
                                   @Qualifier("chatServerListenerQueue")String chatServerListenerQueue) {
        Queue queue = serverQueue(chatServerListenerQueue);
        return BindingBuilder.bind(queue).to(exchange).with(chatServerListenerQueue);
    }

    @Bean
    SimpleMessageListenerContainer rabbitMQListenerContainer(ConnectionFactory connectionFactory,
                                                             MessageListenerAdapter listenerAdapter,
                                                             @Qualifier("chatServerListenerQueue")String chatServerListenerQueue) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        String queueName = chatServerListenerQueue;
        container.setQueueNames(queueName);
        container.setMessageListener(listenerAdapter);
        return container;
    }
}
