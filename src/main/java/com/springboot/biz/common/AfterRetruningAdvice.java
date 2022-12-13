package com.springboot.biz.common;

import org.aspectj.lang.JoinPoint; // 인터페이스 
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
		 * Object obj : 바인딩 변수 (비즈니스 로직을 수행하고 결과를 받는 DTO  객체) - 바인딩 변수를 선언하면 스프링 설정파일에 추가 해야한다.
		 * */
		String method = jp.getSignature().getName();
		// 로직 구현
		if(obj instanceof UsersVO) {
			UsersVO user = (UsersVO) obj;
			if(user.getRole().equals("test")) {
				System.out.println(user.getName()+": 로그인(Admin)");
			} 
		}
			
		System.out.println("[사후처리1] "+method + "() "+ obj.toString() );
	}
}
