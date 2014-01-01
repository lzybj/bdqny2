package com.lzybj.struts.action;

import java.util.List;

import com.lzybj.hibernate.domain.HosHouse;
import com.lzybj.service.HouseService;

public class HouseAction {
	private String uname = "";
	
	//结果对象属性
    private List<HosHouse> res = null;
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public List<HosHouse> getRes() {
		return res;
	}

	public void setRes(List<HosHouse> res) {
		this.res = res;
	}
	
	public String cx(){
		HouseService hs = new HouseService();
		this.setRes(hs.findByUName(uname));
		return "succ";
	}
	
}
