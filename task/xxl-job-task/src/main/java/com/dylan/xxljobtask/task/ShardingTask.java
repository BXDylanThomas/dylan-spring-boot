package com.dylan.xxljobtask.task;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import com.xxl.job.core.util.ShardingUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/11/19 20:38
 */
@Component
@Slf4j
public class ShardingTask {
	@Value("${xxl.job.executor.appname}")
	private String name;

	@XxlJob("shardingOne")
	public ReturnT<String> execute(String param){
		ShardingUtil.ShardingVO shardingVo = ShardingUtil.getShardingVo();
		int total = shardingVo.getTotal();
		log.info("总共有分片"+total+"个");
		List<Integer> list = new ArrayList<>();
		IntStream.range(0,10).forEach(x->list.add(x));

		for (int i = 0; i < total; i++) {
			int index = shardingVo.getIndex();
			if(i == index ){
				log.info("分片:{} 开始处理",index);
				for (int j = 0; j < list.size(); j++) {
					if(j % total == index){
						System.out.print(list.get(j)+ " "  );
					}
				}
			}
		}
		return ReturnT.SUCCESS;
	}

	public void process(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
