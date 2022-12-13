package com.springboot.biz.user;

// VO UsersVo 데이터를 옮기는 클래스
public class UsersVO {
    private String id;
	private String password;
	private String name;
	private String role;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String toString() {
		return "UsersVO [id : "+id+", password : "+password+", name :"+ name + ",role : "+role +" ]";
	}
	
	
}
