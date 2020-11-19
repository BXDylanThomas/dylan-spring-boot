package com.dylan.xxljobtask.task;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/11/19 19:03
 */
@Service
public class AsyncTest {

	@Autowired
	Task task;

	private static void accept(Future x) {
		try {
			System.out.println(x.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

	public void execute(){
		List<Future> list = new ArrayList<>();

		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			list.add(task.process(i));
		}
		System.out.println("耗时1："+(System.currentTimeMillis()-start)+"ms");
//		list.forEach(AsyncTest::accept);

		System.out.println("---------------------");
		list = new ArrayList<>();

		start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			list.add(task.process2());
		}
		System.out.println("耗时2："+(System.currentTimeMillis()-start)+"ms");
//		list.forEach(AsyncTest::accept);

		start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			list.add(task.process3());
		}
		System.out.println("耗时3："+(System.currentTimeMillis()-start)+"ms");
//		list.forEach(AsyncTest::accept);
	}
}
