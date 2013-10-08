package com.lzybj.struts.action;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.lzybj.hibernate.domain.Sms;
import com.lzybj.hibernate.domain.SmsUsers;
import com.lzybj.hibernate.service.SmsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Entity
public class SmsAction extends ActionSupport{
	private String page = "";
	
	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String readResvSmsNum(){
		Map<String,Object> session = ActionContext.getContext().getSession();
		SmsUsers su = (SmsUsers)session.get("su");
		SmsService ss = new SmsService();
		int num = ss.findByResvSmsUsersNoRead(su);
		ServletActionContext.getRequest().setAttribute("noreadnum",num);
		return "succ";
	}
	public String smslistfy(){
		Map<String,Object> session = ActionContext.getContext().getSession();
		SmsUsers su = (SmsUsers)session.get("su");
		SmsService ss = new SmsService();
		List<Sms> data = ss.findByResvSmsUsers(su, page);
		ServletActionContext.getRequest().setAttribute("noreadsmslist",data);
		return "succ";
	}
}
