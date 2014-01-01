package com.lzybj.domain;

public class Users {
	private String uname = "";
	private String upwd = "";
	
	public static Users getInstance(){
		System.out.println("调用了静态方法获得对象!");
		return new Users();
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	private Users(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}
	private Users() {
		super();
	}
	
}
