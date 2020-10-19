package com.demo.springbootpublishlistener;

import org.springframework.context.ApplicationEvent;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/19 20:36
 */
public class MyEvent extends ApplicationEvent {
	public MyEvent(Object source) {
		super(source);
	}
}
