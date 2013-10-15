package com.bdqn.struts.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.bdqn.hibernate.domain.HosHouse;
import com.bdqn.service.HosHouseService;
import com.opensymphony.xwork2.ActionContext;

public class HosHouseAction {
	private String page = "";
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getdatafy(){
		HosHouseService hhs = new HosHouseService();
		if(page.equals("")){
			page = "1";
		}
		List<HosHouse> data = hhs.findByAllForFY(page);
		//放入请求区间内
		ServletActionContext.getRequest().setAttribute("data",data);
		return "succ";
	}
	public String getPageNum(){
		HosHouseService hhs = new HosHouseService();
		List<String> pagecount = hhs.getPageCountList();
		ActionContext.getContext().getSession().put("pagecount",pagecount);
		return "succ";
	}
}
