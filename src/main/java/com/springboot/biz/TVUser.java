package com.springboot.biz;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		/*
		 1.Factory ������ �������� ��ü ���� - �Ű������� �°� ��ü ����(������)
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
		
		/* 2.Spring �����̳� ���� 
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. spring �����̳ʷ� ���� �ʿ��� ��ü�� ��û(LookUp)�Ѵ�.
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.VolumeUp();
		tv.VolumeDown();
		
		// 3. Spring �����̳ʸ� �����Ѵ�.
		factory.close();
		*/
		
		/* 3. �̱��� ���� �׽�Ʈ*/
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. spring �����̳ʷ� ���� �ʿ��� ��ü�� ��û(LookUp)�Ѵ�.
		TV tv1 = (TV) factory.getBean("tv");
//		TV tv2 = (TV) factory.getBean("tv");
//		TV tv3 = (TV) factory.getBean("tv");
		tv1.powerOn();
		tv1.VolumeUp();
		tv1.VolumeDown();
		tv1.powerOff();
		
		
		// 3. Spring �����̳ʸ� �����Ѵ�.
		factory.close();
	}
	
	
	
}
