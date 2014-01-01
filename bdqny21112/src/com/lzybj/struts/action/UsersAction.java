package com.lzybj.struts.action;

import com.lzybj.domain.Users;
import com.lzybj.service.UsersService;

public class UsersAction {
	private Users myuser = null;
	public Users getMyuser() {
		return myuser;
	}
	public void setMyuser(Users myuser) {
		this.myuser = myuser;
	}

	public String reg(){
		UsersService us = new UsersService();
		us.reguser(myuser);
		return "succ";
	}
	
}
