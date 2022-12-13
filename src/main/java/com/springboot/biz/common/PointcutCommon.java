package com.springboot.biz.common;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	@Pointcut("execution(* com.springboot.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("execution(* com.springboot.biz..*Impl.get*(..))")
	public void getPointcut() {}
	
}
