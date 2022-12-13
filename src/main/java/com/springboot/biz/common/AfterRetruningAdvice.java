package com.springboot.biz.common;

import org.aspectj.lang.JoinPoint; // �������̽� 
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.springboot.biz.user.UsersVO;
@Service
@Aspect
public class AfterRetruningAdvice {
	
	
	@AfterReturning(pointcut="PointcutCommon.getPointcut()", returning = "obj")
	public void afterLog(JoinPoint jp,Object obj) {
		/*
		 * JoinPoint jp :
		 * Object obj : ���ε� ���� (����Ͻ� ������ �����ϰ� ����� �޴� DTO  ��ü) - ���ε� ������ �����ϸ� ������ �������Ͽ� �߰� �ؾ��Ѵ�.
		 * */
		String method = jp.getSignature().getName();
		// ���� ����
		if(obj instanceof UsersVO) {
			UsersVO user = (UsersVO) obj;
			if(user.getRole().equals("test")) {
				System.out.println(user.getName()+": �α���(Admin)");
			} 
		}
			
		System.out.println("[����ó��1] "+method + "() "+ obj.toString() );
	}
}
