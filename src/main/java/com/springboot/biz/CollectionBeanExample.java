package com.springboot.biz;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanExample {
	public static void main(String[] args) {
		
		// 스프링 컨테이너로 객체 생성
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		/*
		CollectionBean cb =  (CollectionBean) factory.getBean("collectionBean");
		List<String> list= cb.getAddressList();
		for(String address : list ) {
			
			System.out.println(address);
		}
		factory.close();
		*/
		CollectionBean  cb1	= (CollectionBean) factory.getBean("collectionBean1");
		Map<String,String> map = cb1.getAddressList2();
		for(String key :map.keySet()) {
			System.out.println("key: "+key + " value: "+map.get(key));
		}
		
		factory.close();
		
	
	
	
	}
}
