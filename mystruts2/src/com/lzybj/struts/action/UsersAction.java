package com.lzybj.struts.action;

import org.apache.struts2.components.ActionError;

import com.lzybj.service.UsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UsersAction extends ActionSupport{
	private String uname = "";
	private String upwd = "";
	
	private UsersService us = null;

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

	public UsersService getUs() {
		return us;
	}

	public void setUs(UsersService us) {
		this.us = us;
	}
	
	@Override
	public void validate() {
		if(uname.equals("")){
			this.addFieldError("uname",this.getText("login.err.info.uname"));
		}else{
			if(upwd.equals("")){
				this.addFieldError("upwd",this.getText("login.err.info.upwd"));
			}
		}
	}
	
	public String login(){
		boolean isSucc = us.isLogin(uname, upwd);
		if(isSucc){
			ActionContext.getContext().getSession().put("uname",uname);
			return "succ";
		}
		return "fail";
	}
	
}
