package com.bdqn.service;

public class UsersService {
	public boolean login(String uname,String upwd){
		if(uname.equals("laozheng") && upwd.equals("qaz123")){
			return true;
		}
		return false;
	}
	public boolean register(String uname,String upwd){
		return true;
	}
}
