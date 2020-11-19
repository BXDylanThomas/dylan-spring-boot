package com.dylan.xxljobtask.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/11/19 22:14
 */
@Component
public class TaskOne {

	String prefix1 = "key=";
	String prefix2 = "sql=";

	@Autowired
	Task task;

	@XxlJob("task1")
	public ReturnT process(String param){
		List req = new ArrayList();

		if(param == null || "".equals(param)) {
			IntStream.range(0,5).forEach(x->req.add("无"+x));
		}else if (param.startsWith(prefix1)){
			param = param.replaceFirst(prefix1,"");
			IntStream.range(0,3).forEach(x->req.add(prefix1+x));
		}else if (param.startsWith(prefix2)){
			param = param.replaceFirst(prefix2,"");
			IntStream.range(0,4).forEach(x->req.add(prefix2+x));
		}
		List<Future> res = one(req,x->task.process(x));
		print(res, x-> System.out.println(x.get()));

		return ReturnT.SUCCESS;
	}

	interface dFunction<T,R>{
		R apply(T t);
	}
	interface dConsumer<T>{
		void apply(T t) throws ExecutionException, InterruptedException;
	}

	public void print(List<Future> list,dConsumer<Future> dConsumer){
		list.forEach(x-> {
			try {
				dConsumer.apply(x);
			} catch (ExecutionException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}

	public List<Future> one(List list,dFunction<Object,Future> df){
		List<Future> fList = new ArrayList<>();
		list.stream().forEach(x->fList.add(df.apply(x)));
		while (true){
			if(fList.stream().allMatch(Future::isDone)){
				break;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return fList;
	}
}
