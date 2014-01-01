package com.lzybj.struts.form;

import org.apache.struts.action.ActionForm;

public class LoginActionForm extends ActionForm{
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
}
