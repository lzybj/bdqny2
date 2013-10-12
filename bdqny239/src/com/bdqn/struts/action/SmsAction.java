package com.bdqn.struts.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.bdqn.hibernate.domain.SmsUsers;
import com.bdqn.hibernate.resobj.SmsResObj;
import com.bdqn.service.SmsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SmsAction extends ActionSupport{
	public String getNoReadNum(){
		Map<String,Object> session = ActionContext.getContext().getSession();
		SmsUsers su = (SmsUsers)session.get("su");
		SmsService ss = new SmsService();
		int num = ss.findByResvUserNoReadNum(su.getUname());
		ServletActionContext.getRequest().setAttribute("noreadnum",num);
		return "succ";
	}
	public String getNoReadList(){
		Map<String,Object> session = ActionContext.getContext().getSession();
		SmsUsers su = (SmsUsers)session.get("su");
		SmsService ss = new SmsService();
		List<SmsResObj> data = ss.findByResvUserNoReadList(su.getUname());
		ServletActionContext.getRequest().setAttribute("noreadlist",data);
		return "succ";
	}
}
