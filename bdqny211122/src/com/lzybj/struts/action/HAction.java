package com.lzybj.struts.action;

import java.util.Date;

public class HAction {
	private Date birthday = null;

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String add(){
		return "succ";
	}
}
