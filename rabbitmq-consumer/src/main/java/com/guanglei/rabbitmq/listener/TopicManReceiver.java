package com.guanglei.rabbitmq.listener;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topic.man")
public class TopicManReceiver {
	
	@RabbitHandler
    public void process(Map<String, Object> testMessage) {
        System.out.println("TopicManReceiver消费者收到消息  : " + testMessage.toString());
    }


}