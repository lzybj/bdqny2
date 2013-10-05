package com.bdqn.myaction;

import javax.servlet.http.HttpServletRequest;

import com.bdqn.freamwork.action.Action;
import com.bdqn.service.UsersService;

public class LoginAction implements Action{
	public String execute(HttpServletRequest request) {
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		UsersService us = new UsersService();
		String strUrl = "";
		if(us.isLogin(userName, passWord)){
			strUrl = "succ";
		}else{
			strUrl = "fail";
		}		
		return strUrl;
	}
}
