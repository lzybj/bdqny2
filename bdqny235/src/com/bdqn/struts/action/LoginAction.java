package com.bdqn.struts.action;

import java.util.Map;

import com.bdqn.hibernate.domain.SysUser;
import com.bdqn.hibernate.service.SysUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String uname = "";
	private String upassword = "";
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	
	@Override
	public void validate() {
		//在此进行表单验证或者数据校验等工作
		if(uname.equals("")){
			this.addFieldError("uname","对不起，用户名不能为空！");
		}else{
			if(upassword.equals("")){
				this.addFieldError("upassword","对不起，密码不能为空！");
			}
		}
	}
	
	public String execute(){
		SysUserService sus = new SysUserService();
		SysUser myuser = sus.login(uname, upassword);
		if(myuser != null){
			//启session
            Map<String,Object> session = ActionContext.getContext().getSession();
            session.put("myuser",myuser);
			return "toaction";
		}else{
			this.addActionError("对不起，用户名或密码错误！");
		}
		return INPUT;
	}
	
}
