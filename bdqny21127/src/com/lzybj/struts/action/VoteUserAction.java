package com.lzybj.struts.action;

import com.lzybj.hibernate.domain.VoteUser;
import com.lzybj.service.VoteUserService;
import com.opensymphony.xwork2.ActionContext;

public class VoteUserAction {
	private String uname = "";
	private String upwd = "";
	private VoteUserService vus = null;
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
	public VoteUserService getVus() {
		return vus;
	}
	public void setVus(VoteUserService vus) {
		this.vus = vus;
	}
	
	public String login(){
		VoteUser vu = vus.isLogin(uname, upwd);
		if(vu != null){
			ActionContext.getContext().getSession().put("vu",vu);
			return "succ";
		}else{
			return "fail";
		}
	}
	
}
