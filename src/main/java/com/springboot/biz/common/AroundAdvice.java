package com.springboot.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
@Service
@Aspect // AOP 구현 Aspect := 포인트컷 + 어드바이스 
public class AroundAdvice {
	
	@Around("PointcutCommon.allPointcut()")
	public Object aroundLog(ProceedingJoinPoint pj) throws Throwable {
		String method = pj.getSignature().getName();
		
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		
		Object obj = pj.proceed();
		
		stopwatch.stop();
		
		System.out.println(method+"() 메소드 수행에 걸린 시간 : "+
				stopwatch.getTotalTimeMillis()+"(ms) 초");
		return obj;
		
	}
}
