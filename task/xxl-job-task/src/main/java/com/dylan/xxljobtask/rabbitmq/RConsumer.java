package com.dylan.xxljobtask.rabbitmq;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/11/19 21:15
 */
@Component
public class RConsumer {

	@RabbitListener(queuesToDeclare = @Queue("dylan"))
	public void process(String msg){
		System.out.println(msg);
	}

	@RabbitListener(bindings = @QueueBinding(value = @Queue("dylan-2"),exchange = @Exchange(value = "2-change",type = ExchangeTypes.TOPIC),key = "dylan.#"))
	public void process2(String msg){
		System.out.println("2 -> "+msg);
	}

	@RabbitListener(bindings = @QueueBinding(value = @Queue("dylan-3"),exchange = @Exchange(value = "2-change",type = ExchangeTypes.TOPIC),key = "aa.*"))
	public void process3(String msg){
		System.out.println("3 -> "+msg);
	}
}
