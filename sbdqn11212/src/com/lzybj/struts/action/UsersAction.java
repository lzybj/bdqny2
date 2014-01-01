package com.lzybj.struts.action;

import java.util.ArrayList;
import java.util.List;

public class UsersAction {
	private String uname = "";
	private String upwd = "";
	private List<String> data = null;
	
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
	public String reg(){
		List<String> mydata = new ArrayList<String>();
		mydata.add("1");
		mydata.add("2");
		mydata.add("3");
		this.setData(mydata);
		return "succ";
	}
	
}
