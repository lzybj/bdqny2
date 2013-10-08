package com.bdqn.struts.action;

import java.util.Map;

import com.bdqn.hibernate.domain.SmsUsers;
import com.bdqn.service.SmsUsersServcie;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SmsUsersAction extends ActionSupport{
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


	public String login(){
		SmsUsersServcie sus = new SmsUsersServcie();
		SmsUsers su = sus.login(uname, upwd);
		if(su != null){
			Map<String,Object> session = ActionContext.getContext().getSession();
			session.put("su",su);
			return "succ";
		}
		return "fail";
	}
}
