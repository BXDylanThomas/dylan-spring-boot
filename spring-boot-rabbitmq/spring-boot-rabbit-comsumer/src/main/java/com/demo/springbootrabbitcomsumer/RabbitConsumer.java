package com.demo.springbootrabbitcomsumer;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/17 17:17
 */
@Component
@RabbitListener(queues = "dylan_direct_queue")
public class RabbitConsumer {

	@RabbitHandler
	public void process(String msg) throws IOException {
		System.out.println(" 队列接收到的消息 : " + msg);
	}
}
