package com.dylan.xxljobtask.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/11/19 19:52
 */
@Component
public class ScheduleOne {

	@Autowired
	private AmqpTemplate amqpTemplate;

	@XxlJob("taskone")
	public ReturnT<String> execute(String param) throws Exception {
//		XxlJobLogger.log("XXL-JOB, Hello World.");
//
//		for (int i = 0; i < 5; i++) {
//			XxlJobLogger.log("beat at:" + i);
//			TimeUnit.SECONDS.sleep(2);
//		}
//		System.out.println("hello ");

		amqpTemplate.convertAndSend("dylan","tt");
		amqpTemplate.convertAndSend("2-change","dylan","dylan");
		amqpTemplate.convertAndSend("2-change","dylan.dd","aa");
		amqpTemplate.convertAndSend("2-change","aa.","dy");
		amqpTemplate.convertAndSend("2-change","aa.dylan","11dy");
		amqpTemplate.convertAndSend("2-change","dylan.aa","aadylana");

//		amqpTemplate.convertAndSend();
		return IJobHandler.SUCCESS;
	}
}
