package com.lzybj.struts.action;

import java.util.List;

import com.lzybj.domain.Customers;
import com.lzybj.service.CustomersService;

public class CustomersAction {
	private String cname = "";
	private CustomersService cs = null;
	private List<Customers> res = null;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
//	public CustomersService getCs() {
//		return cs;
//	}
//	public void setCs(CustomersService cs) {
//		this.cs = cs;
//	}
//	public List<Customers> getRes() {
//		return res;
//	}
//	public void setRes(List<Customers> res) {
//		this.res = res;
//	}
	
	public String cx(){
//		this.setRes(cs.findByCNameFromWS(cname));
		return "succ";
	}
	
}
