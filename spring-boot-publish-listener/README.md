# 发布订阅模式

##第一种

发布者
~~~java
public class MyEvent extends ApplicationEvent {
	public MyEvent(Object source) {
		super(source);
	}
}

~~~
监听者
~~~~java
@Component
public class MyListener1 implements ApplicationListener<MyEvent> {
	
	@Override
	public void onApplicationEvent(MyEvent myEvent) {
		System.out.println(myEvent.getSource());
	}
}
~~~~

applicationContext.publishEvent(new MyEvent("event 1"));


##第二种

~~~~java
@Component
public class MyListener2 {

	@EventListener()
	public void listen(MyEvent2 myEvent){
		System.out.println(myEvent.getSource());
	}
}
~~~~
applicationContext.publishEvent(new MyEvent2("event 2"));
