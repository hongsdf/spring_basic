package com.springboot.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
/* 
 * JoinPoint jp 인터페이스 사용시 스프링 설정파일을 따로 수정하지 않아도 된다.
 * 
 */
@Service
@Aspect
public class AfterThrowingAdvice {
	
	
	@AfterThrowing(pointcut="PointcutCommon.allPointcut()", throwing = "ex")
	public void throwLog(JoinPoint jp,Exception ex) {
		String method = jp.getSignature().getName();
		System.out.println(method + "() 메소드 수행 중 예외처리 발생");
		
		if(ex instanceof IllegalArgumentException) {
			System.out.println("부적절한 값이 입력되었습니다");
		}else if(ex instanceof NumberFormatException) {
			System.out.println("숫자 형식이 아닌 값이 입력 되었습니다.");
		}else if(ex instanceof Exception) {
			System.out.println("문제가 발생되었습니다.");
		}
	}
}
