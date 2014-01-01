package com.lzybj.struts.action;

import java.util.List;

import com.lzybj.hibernate.domain.Lxrs;
import com.lzybj.hibernate.domain.Users;
import com.lzybj.service.LxrsService;
import com.opensymphony.xwork2.ActionContext;

public class LxrsAction {
	private String lxrname = "";
	
	private LxrsService lxrsservice = null;
	
	private List<Lxrs> lxrsdata = null;

	public String getLxrname() {
		return lxrname;
	}

	public void setLxrname(String lxrname) {
		this.lxrname = lxrname;
	}

	public LxrsService getLxrsservice() {
		return lxrsservice;
	}

	public void setLxrsservice(LxrsService lxrsservice) {
		this.lxrsservice = lxrsservice;
	}

	public List<Lxrs> getLxrsdata() {
		return lxrsdata;
	}

	public void setLxrsdata(List<Lxrs> lxrsdata) {
		this.lxrsdata = lxrsdata;
	}
	
	public String cxlxrs(){
		Users myuser = (Users)ActionContext.getContext().getSession().get("myuser");
		this.setLxrsdata(lxrsservice.findByLxrName(myuser, lxrname));
		return "succ";
	}

}
