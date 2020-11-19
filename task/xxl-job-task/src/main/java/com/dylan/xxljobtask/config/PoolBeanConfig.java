package com.dylan.xxljobtask.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/11/19 18:59
 */
@Component
public class PoolBeanConfig {

	@Bean("poolOne")
	public ThreadPoolExecutor poolOne(){
		ThreadPoolExecutor threadPoolExecutor =
				new ThreadPoolExecutor(10, 20, 0, TimeUnit.SECONDS, new LinkedBlockingDeque<>(10000));

		return threadPoolExecutor;
	}

	@Bean("poolTwo")
	public ThreadPoolExecutor poolTwo(){
		ThreadPoolExecutor threadPoolExecutor =
				new ThreadPoolExecutor(10, 20, 0, TimeUnit.SECONDS, new LinkedBlockingDeque<>(10000));

		return threadPoolExecutor;
	}
}
