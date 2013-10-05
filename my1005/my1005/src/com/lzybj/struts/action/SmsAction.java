package com.lzybj.struts.action;

import java.util.Map;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.lzybj.hibernate.domain.SmsUsers;
import com.lzybj.hibernate.service.SmsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Entity
public class SmsAction extends ActionSupport{
	public String readResvSmsNum(){
		Map<String,Object> session = ActionContext.getContext().getSession();
		SmsUsers su = (SmsUsers)session.get("su");
		SmsService ss = new SmsService();
		int num = ss.findByResvSmsUsersNoRead(su);
		ServletActionContext.getRequest().setAttribute("noreadnum",num);
		return "succ";
	}
}
