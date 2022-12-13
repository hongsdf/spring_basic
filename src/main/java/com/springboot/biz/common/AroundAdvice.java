package com.springboot.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
@Service
@Aspect // AOP ���� Aspect := ����Ʈ�� + �����̽� 
public class AroundAdvice {
	
	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pj) throws Throwable {
		String method = pj.getSignature().getName();
		
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		
		Object obj = pj.proceed();
		
		stopwatch.stop();
		
		System.out.println(method+"() �޼ҵ� ���࿡ �ɸ� �ð� : "+
				stopwatch.getTotalTimeMillis()+"(ms) ��");
		return obj;
		
	}
}
