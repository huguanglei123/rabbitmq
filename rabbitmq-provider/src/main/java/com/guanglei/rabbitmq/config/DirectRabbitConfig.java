package com.guanglei.rabbitmq.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DirectRabbitConfig {
	
	@Bean
	public Queue TestDirectQueue() {
		return new Queue("TestDirectQueue", true);
	}
	
	@Bean
	public DirectExchange TestDirecctExchange() {
		return new DirectExchange("TestDirectExchange", true, false);
	}
	
	@Bean
	public Binding bindingDirect() {
		return BindingBuilder.bind(TestDirectQueue()).to(TestDirecctExchange()).with("TestDirectRouting");
	}
	
	@Bean
    DirectExchange lonelyDirectExchange() {
        return new DirectExchange("lonelyDirectExchange");
    }
	
}
