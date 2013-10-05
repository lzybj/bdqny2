package com.bdqn.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.bdqn.service.UsersService;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	//将请求参数名作为Action中的属性实现
	//userName
	private String userName = "";
	//passWord
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
		//1.调用业务逻辑
		UsersService us = new UsersService();
		if(us.login(userName, passWord)){
			//创建session--与servlet无关
//			Map<String,Object> session = ActionContext.getContext().getSession();
//			session.put("username",userName);
			//创建session--与servlet有关,
			//可以通过ServletActionContext对象获得部分Servlet对象,
			//例如：HttpServletRequest,HttpServletResponse,HttpSession
            	HttpSession session = ServletActionContext.getRequest().getSession();
            	session.setAttribute("username",userName);
			return "succ";
		}
		return "fail";
	}
}
