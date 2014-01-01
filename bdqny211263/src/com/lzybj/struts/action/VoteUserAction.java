package com.lzybj.struts.action;

import com.lzybj.service.VoteUserService;

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
	
	public String reg(){
		vus.addVu(uname, upwd);
		return "succ";
	}
	
}
