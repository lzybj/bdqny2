package com.bdqn.hibernate.resobj;

public class MyUsers {
	private String htid = "";
	private String upwd = "";
	public MyUsers(String htid, String upwd) {
		super();
		this.htid = htid;
		this.upwd = upwd;
	}
	public String getHtid() {
		return htid;
	}
	public void setHtid(String htid) {
		this.htid = htid;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
}
