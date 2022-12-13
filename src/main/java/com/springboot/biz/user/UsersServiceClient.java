package com.springboot.biz.user;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UsersServiceClient {
	public static void main(String[] args) {
		// 1. spring 컨테이너 구동
		AbstractApplicationContext container =
				new  GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 UsersServiceImpl 객체를 Lookup 검색한다.
		UsersService usersService =  (UsersService) container.getBean("usersService");
		
		// 3. 유저 목록 테스트
		UsersVO vo = new UsersVO(); // DB의 정보그대로를 가지고 온다.
		vo.setId("test");
		vo.setPassword("test123");
		UsersVO user = usersService.getUsers(vo);

		if(user != null) {
			System.out.println(user.getName() + " 님 환영합니다.");
		}else {
			System.out.println("로그인 실패");
		}
		
		// 4.컨테이너 종료
		container.close();
		
	}
}
