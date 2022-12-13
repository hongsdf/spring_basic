package com.springboot.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {
	
	                             
	@After("PointcutCommon.allPointcut()")
	public void finallyLog() {
		System.out.println("[finallyLog] try ~ catch ~ finally 블록처럼 예외발생여부와 상관없이 무조건 수행되는 로직");
	}
	
}
