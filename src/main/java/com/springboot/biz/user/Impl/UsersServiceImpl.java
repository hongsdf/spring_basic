package com.springboot.biz.user.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.biz.user.UsersService;
import com.springboot.biz.user.UsersVO;

@Service("usersService")
public class UsersServiceImpl implements UsersService{
	@Autowired
	private UsersDAO usersDAO;

	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}
	
	public UsersVO getUsers(UsersVO vo) {
		return usersDAO.getUsers(vo);
	}
	

}
