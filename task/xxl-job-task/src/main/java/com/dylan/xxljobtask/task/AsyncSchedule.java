package com.dylan.xxljobtask.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/11/19 22:06
 */
@Component
public class AsyncSchedule {

	@Autowired
	private Task task;

	@XxlJob("asy")
	public ReturnT process(String param){

		return ReturnT.SUCCESS;
	}
}
