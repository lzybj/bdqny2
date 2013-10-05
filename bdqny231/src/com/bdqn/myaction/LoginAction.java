package com.bdqn.myaction;

import javax.servlet.http.HttpServletRequest;

import com.bdqn.mystruts.action.Action;
import com.bdqn.service.UsersService;

public class LoginAction implements Action{
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		UsersService us = new UsersService();
		String logicUrl = "";
		if(us.login(userName, passWord)){
			logicUrl = "succ";
		}else{
			logicUrl = "fail";
		}
		return logicUrl;
	}
}
