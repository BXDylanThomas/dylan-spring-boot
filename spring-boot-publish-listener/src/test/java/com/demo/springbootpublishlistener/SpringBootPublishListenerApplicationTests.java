package com.demo.springbootpublishlistener;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootPublishListenerApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void contextLoads() {
		applicationContext.publishEvent(new MyEvent("event 1"));
		applicationContext.publishEvent(new MyEvent2("event 2"));

	}

}
