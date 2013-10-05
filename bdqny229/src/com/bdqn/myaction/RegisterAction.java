package com.bdqn.myaction;

import javax.servlet.http.HttpServletRequest;

import com.bdqn.freamwork.action.Action;
import com.bdqn.service.UsersService;

public class RegisterAction implements Action{
	public String execute(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		UsersService us = new UsersService();
		String strUrl = "";
		if(us.register(userName, passWord)){
			strUrl = "succ";
		}else{
			strUrl = "fail";
		}
		return strUrl;
	}
}
