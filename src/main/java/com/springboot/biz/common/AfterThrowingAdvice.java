package com.springboot.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
/* 
 * JoinPoint jp �������̽� ���� ������ ���������� ���� �������� �ʾƵ� �ȴ�.
 * 
 */
@Service
@Aspect
public class AfterThrowingAdvice {
	
	
	@AfterThrowing(pointcut="PointcutCommon.allPointcut()", throwing = "ex")
	public void throwLog(JoinPoint jp,Exception ex) {
		String method = jp.getSignature().getName();
		System.out.println(method + "() �޼ҵ� ���� �� ����ó�� �߻�");
		
		if(ex instanceof IllegalArgumentException) {
			System.out.println("�������� ���� �ԷµǾ����ϴ�");
		}else if(ex instanceof NumberFormatException) {
			System.out.println("���� ������ �ƴ� ���� �Է� �Ǿ����ϴ�.");
		}else if(ex instanceof Exception) {
			System.out.println("������ �߻��Ǿ����ϴ�.");
		}
	}
}
