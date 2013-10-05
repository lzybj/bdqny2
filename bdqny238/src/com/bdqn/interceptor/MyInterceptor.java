package com.bdqn.interceptor;

import java.util.Map;

import com.bdqn.action.LoginAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		if(arg0.getAction() instanceof LoginAction){
			return arg0.invoke();
		}
		Map<String,Object> session = arg0.getInvocationContext().getSession();
		String uname = (String)session.get("uname");
		if(uname != null){
			//Ìø¹ýÀ¹½ØÆ÷
			return arg0.invoke();
		}
		return "login";
	}

}
