package com.bdqn.struts.action;

import java.util.Map;

import com.bdqn.hibernate.service.UsersService;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	private String userName = "";
	private String passWord = "";
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String execute(){
		UsersService us = new UsersService();
		if(us.login(userName, passWord)){
			Map<String,Object> session = ActionContext.getContext().getSession();
			session.put("username", userName);
			return "succ";
		}
		return "fail";
	}
	public static void main(String[] args) {
		LoginAction la = new LoginAction();
		la.setUserName("xxx0");
		la.setPassWord("sfsdfsd");
		System.out.println(la.execute());
	}
}
