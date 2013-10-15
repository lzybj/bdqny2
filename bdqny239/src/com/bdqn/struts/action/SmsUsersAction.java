package com.bdqn.struts.action;

import java.util.Map;

import com.bdqn.hibernate.domain.SmsUsers;
import com.bdqn.service.SmsUsersServcie;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SmsUsersAction extends ActionSupport{
	private String uname = "";
	private String upwd = "";
	private String reupwd = "";
	
	
	public String getReupwd() {
		return reupwd;
	}


	public void setReupwd(String reupwd) {
		this.reupwd = reupwd;
	}


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

//	@Override
//	public void validate() {
//		if(uname.equals("")){
//			this.addFieldError("uname","对不起，用户名不能为空！");
//		}else{
//			if(uname.length() < 5 || uname.length() > 32){
//				this.addFieldError("uname","对不起，用户名定义超出长度！");
//			}
//		}
//		if(upwd.equals("")){
//			this.addFieldError("upwd","对不起，密码不能为空！");			
//		}else{
//			if(upwd.length() < 6){
//				this.addFieldError("upwd","对不起，密码不符合规范");				
//			}else{
//				if(!upwd.equals(reupwd)){
//					this.addFieldError("reupwd","对不起，两次密码不一致！");					
//				}
//			}
//		}
//	}

	public String login(){
		SmsUsersServcie sus = new SmsUsersServcie();
		SmsUsers su = sus.login(uname, upwd);
		if(su != null){
			Map<String,Object> session = ActionContext.getContext().getSession();
			session.put("su",su);
			session.put("myinfo",this.getText("sms.login.action.info"));
			return "succ";
		}
		return "fail";
	}
	
	public String register(){
		SmsUsersServcie sus = new SmsUsersServcie();
		boolean isSucc = sus.register(uname, upwd);
		if(isSucc){
			Map<String,Object> session = ActionContext.getContext().getSession();
			session.put("su",new SmsUsers(uname, upwd));
			return "succ";
		}
		return "fail";
	}
}
