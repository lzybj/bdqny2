package com.lzybj.struts.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class UsersAction {
	private String uname = "";
	private List<String> mydata = null;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	
	
	public List<String> getMydata() {
		return mydata;
	}

	public void setMydata(List<String> mydata) {
		this.mydata = mydata;
	}

	public String reg(){
		//ActionContext.getContext().getValueStack();
		List<String> data = new ArrayList<String>();
		data.add("java");
		data.add("sqlserver");
		data.add("oracle");
		this.setMydata(data);
		return "succ";
	}
}
