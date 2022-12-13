package com.springboot.biz.user;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UsersServiceClient {
	public static void main(String[] args) {
		// 1. spring �����̳� ����
		AbstractApplicationContext container =
				new  GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring �����̳ʷκ��� UsersServiceImpl ��ü�� Lookup �˻��Ѵ�.
		UsersService usersService =  (UsersService) container.getBean("usersService");
		
		// 3. ���� ��� �׽�Ʈ
		UsersVO vo = new UsersVO(); // DB�� �����״�θ� ������ �´�.
		vo.setId("test");
		vo.setPassword("test123");
		UsersVO user = usersService.getUsers(vo);

		if(user != null) {
			System.out.println(user.getName() + " �� ȯ���մϴ�.");
		}else {
			System.out.println("�α��� ����");
		}
		
		// 4.�����̳� ����
		container.close();
		
	}
}
