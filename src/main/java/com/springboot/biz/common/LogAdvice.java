package com.springboot.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect // Aspect = 포인트 컷(클라가 요청한 로직) + 어드바이스(구동시점)
public class LogAdvice {
	@Pointcut("execution(* com.springboot.biz..*Impl.*(..))")
	public void allPointcut() {};
	
	/*
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {
		
	}
	*/
	
	/*어드바이스 구동시점작성*/
	@Before("allPointcut()")
	public void pringLog() {
		System.out.println("[공통로그] 비즈니스 로직 전 수행");
	}
	
	
}
