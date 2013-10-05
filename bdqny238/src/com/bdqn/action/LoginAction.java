package com.bdqn.action;

import java.util.Map;

import com.bdqn.service.UsersService;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private String uname = "";
	private String upwd = "";
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
	public String execute(){
		UsersService us = new UsersService();
		if(us.login(uname, upwd)){
			Map<String,Object> session = ActionContext.getContext().getSession();
			session.put("uname",uname);
			return "succ";
		}
		return "fail";
	}
}
