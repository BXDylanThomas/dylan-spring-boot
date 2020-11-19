package com.dylan.xxljobtask.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/11/19 21:21
 */
@Component
public class RabbitmqConfig {

	@Bean
	public Queue dylan(){
		return new Queue("dylan",true);
	}
}
