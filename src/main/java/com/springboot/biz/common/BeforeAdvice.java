package com.springboot.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {

	
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp) {
		/*
		 * getSignature : 클라가 호출한 메서드 명 반환
		 * getArgs : 매개변수 목록 반환
		 * */
		String method = jp.getSignature().getName();
		Object args[] = jp.getArgs();
		System.out.println("[사전 처리] 비즈니스 로직 처리 전 " + method +"() 메소드 args 정보 : "+
				args[0].toString()
				);
	}
}
