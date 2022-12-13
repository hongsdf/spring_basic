package com.springboot.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect // Aspect = ����Ʈ ��(Ŭ�� ��û�� ����) + �����̽�(��������)
public class LogAdvice {
	@Pointcut("execution(* com.springboot.biz..*Impl.*(..))")
	public void allPointcut() {};
	
	/*
	@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut() {
		
	}
	*/
	
	/*�����̽� ���������ۼ�*/
	@Before("allPointcut()")
	public void pringLog() {
		System.out.println("[����α�] ����Ͻ� ���� �� ����");
	}
	
	
}
