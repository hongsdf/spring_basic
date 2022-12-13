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
		 * getSignature : Ŭ�� ȣ���� �޼��� �� ��ȯ
		 * getArgs : �Ű����� ��� ��ȯ
		 * */
		String method = jp.getSignature().getName();
		Object args[] = jp.getArgs();
		System.out.println("[���� ó��] ����Ͻ� ���� ó�� �� " + method +"() �޼ҵ� args ���� : "+
				args[0].toString()
				);
	}
}
