package com.demo.springbootpublishlistener;

import org.springframework.context.ApplicationEvent;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/19 20:39
 */
public class MyEvent2 extends ApplicationEvent {
	public MyEvent2(Object source) {
		super(source);
	}
}
