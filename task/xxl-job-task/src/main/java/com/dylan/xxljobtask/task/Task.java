package com.dylan.xxljobtask.task;

import groovy.util.logging.Log;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/11/19 19:18
 */
@Component
@Slf4j
public class Task {

	@SneakyThrows
	@Async("poolTwo")
	public Future<String> process(Object obj){
		Thread.sleep(2000);
		print(1);
		return new AsyncResult("1 -> "+Thread.currentThread().getName() + obj.toString());
	}

	@SneakyThrows
	@Async("poolTwo")
	public Future<String> process2(){
		Thread.sleep(1000);
		print(2);
		return new AsyncResult("2 -> " +Thread.currentThread().getName());
	}

	@SneakyThrows
	@Async("poolTwo")
	public Future<String> process3(){
		Thread.sleep(1000);
		print(3);
		return new AsyncResult("3 -> " +Thread.currentThread().getName());
	}

	private void print(int id){
//		log.info(id + " -> "+ Thread.currentThread().getName());
//		System.out.println(id + " -> "+ Thread.currentThread().getName());
	}


}
