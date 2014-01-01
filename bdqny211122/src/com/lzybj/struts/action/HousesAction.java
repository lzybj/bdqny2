package com.lzybj.struts.action;

import com.lzybj.hibernate.domain.Houses;
import com.lzybj.hibernate.domain.Points;
import com.lzybj.service.HouseService;

public class HousesAction {
	private Houses myhouse = null;
	private Points mypoint = null;
	public Houses getMyhouse() {
		return myhouse;
	}
	public void setMyhouse(Houses myhouse) {
		this.myhouse = myhouse;
	}
	public Points getMypoint() {
		return mypoint;
	}
	public void setMypoint(Points mypoint) {
		this.mypoint = mypoint;
	}
	
	public String fabu(){
		HouseService hs = new HouseService();
		hs.faBuHouse(myhouse, mypoint);
		return "succ";
	}
	
}
