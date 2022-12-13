package com.springboot.biz;

public class BeanFactory {
	public Object getBeans(String BeanName) {
		if(BeanName.equals("samsung")) {
			return new SamsungTv();
		}else if(BeanName.equals("lg")) {
			return new LgTv();
		}
		return null;
	}
}
