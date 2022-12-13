package com.springboot.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 1.Factory 디자인 패턴으로 객체 생성 - 매개변수에 맞게 객체 구현(다형성)
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBeans(args[0]);
		
		*/
		/*
		TV tv = new SamsungTv();
		tv.VolumeUp();
		tv.VolumeDown();
		tv.powerOn();
		tv.powerOff();
		
		//tv = new LgTv();
		tv.VolumeUp();
		tv.VolumeDown();
		tv.powerOn();
		tv.powerOff();
		*/
		
		/* 2.Spring 컨테이너 구동 
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. spring 컨테이너로 부터 필요한 객체를 요청(LookUp)한다.
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.VolumeUp();
		tv.VolumeDown();
		
		// 3. Spring 컨테이너를 종료한다.
		factory.close();
		*/
		
		/* 3. 싱글톤 패턴 테스트*/
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. spring 컨테이너로 부터 필요한 객체를 요청(LookUp)한다.
		TV tv1 = (TV) factory.getBean("tv");
//		TV tv2 = (TV) factory.getBean("tv");
//		TV tv3 = (TV) factory.getBean("tv");
		tv1.powerOn();
		tv1.VolumeUp();
		tv1.VolumeDown();
		tv1.powerOff();
		
		
		// 3. Spring 컨테이너를 종료한다.
		factory.close();
	}
	
	
	
}
