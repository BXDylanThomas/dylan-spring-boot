package com.demo.springbootpublishlistener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * code is far away from bug with the animal protecting
 *
 * @Author : dylan
 * @Date :create in 2020/10/19 20:37
 */

@Component
public class MyListener2 {

	@EventListener()
	public void listen(MyEvent2 myEvent){
		System.out.println(myEvent.getSource());
	}
}
