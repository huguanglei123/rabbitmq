package com.guanglei.rabbitmq.listener;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA2 {

	@RabbitHandler
	public void process(Map<String, Object> testMessage) {
		System.out.println("FanoutReceiverA2消费者收到消息" + testMessage.toString());
	}
}
