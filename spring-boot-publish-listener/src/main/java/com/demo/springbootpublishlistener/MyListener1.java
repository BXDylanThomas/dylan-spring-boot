package com.demo.springbootpublishlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/19 20:36
 */
@Component
public class MyListener1 implements ApplicationListener<MyEvent> {

	@Override
	public void onApplicationEvent(MyEvent myEvent) {
		System.out.println(myEvent.getSource());
	}
}
