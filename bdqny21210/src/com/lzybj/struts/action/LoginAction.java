package com.lzybj.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.lzybj.service.UsersService;
import com.lzybj.struts.form.LoginActionForm;

public class LoginAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		LoginActionForm loginform = (LoginActionForm)form;
		String uname = loginform.getUname();
		String upwd = loginform.getUpwd();
		//调用业务逻辑
		UsersService us = new UsersService();
		boolean isLogin = us.isLogin(uname, upwd);
		//定义逻辑地址
		String logicAddr = "";
		if(isLogin){
			logicAddr = "succ";
		}else{
			logicAddr = "fail";
		}
		return mapping.findForward(logicAddr);
	}
}
