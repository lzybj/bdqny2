package com.lzybj.struts.action;

import java.util.Map;

import com.lzybj.hibernate.domain.SmsUsers;
import com.lzybj.hibernate.service.SmsUsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import javax.persistence.Entity;

@Entity
public class SmsUsersAction extends ActionSupport {
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
		SmsUsersService sus = new SmsUsersService();
		SmsUsers su = sus.login(uname);
		if(su != null){
			if(su.getUpwd().equals(upwd)){
				Map<String,Object> session = ActionContext.getContext().getSession();
				session.put("su",su);
				return "succ";
			}
		}
		return "fail";
	}
}
