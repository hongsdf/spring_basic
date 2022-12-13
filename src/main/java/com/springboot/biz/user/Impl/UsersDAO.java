package com.springboot.biz.user.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.biz.common.JDBCUtil;
import com.springboot.biz.user.UsersVO;
 
// ������̼��� �ƴ� Bean���� ����� �����̿��� @Repository�� �ּ�ó��
@Repository("UsersDAO")
public class UsersDAO  {
		private Connection conn = null;
		private PreparedStatement stmt = null;
		private ResultSet rs = null;
		
		// SQL ��ɾ��
		//private final String USER_INSERT = "insert into users(id,password,name,role) valuse(?,?,?,?) ";
		//private final String USER_UPDATE = "update users set password = ? where id =?";
		//private final String USER_DELETE = "delete users where id = ?";
		private final String USER_GET = "select * from users where id =? and password =?";
		//private final String USER_LIST = "select * from users order by id desc";
		
		
		// CRUD �޼ҵ� ����
		// ���� ���
		
		
		// ���� ��������ȸ
		public UsersVO getUsers(UsersVO vo) {
			UsersVO users = null;
			try {
				System.out.println("===> JDBC�� getUsers() ��� ó��");
				conn = JDBCUtil.getConnection();
				stmt =  conn.prepareStatement(USER_GET);
				stmt.setString(1, vo.getId());
				stmt.setString(2, vo.getPassword());
				rs = stmt.executeQuery();
				if(rs.next()) {
					users = new UsersVO();
					users.setId(rs.getString("ID"));
					users.setPassword(rs.getString("PASSWORD"));
					users.setName(rs.getString("NAME"));
					users.setRole(rs.getString("ROLE"));
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				JDBCUtil.close(rs,stmt, conn);
			}
			
			return users;
		}
		
		
}
