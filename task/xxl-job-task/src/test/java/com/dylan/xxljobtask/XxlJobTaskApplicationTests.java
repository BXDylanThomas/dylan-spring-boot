package com.dylan.xxljobtask;

import com.dylan.xxljobtask.task.AsyncTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;

import java.io.IOException;

@SpringBootTest
@EnableAsync
class XxlJobTaskApplicationTests {

	@Autowired
	AsyncTest asyncTest;

	@Test
	void contextLoads() throws IOException {
		asyncTest.execute();

		System.in.read();
	}

}
