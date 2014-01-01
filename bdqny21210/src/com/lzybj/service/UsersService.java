package com.lzybj.service;

public class UsersService {
	public boolean isLogin(String uname,String upwd){
		if(uname.equals("lzybj") && upwd.equals("qaz123")){
			return true;
		}
		return false;
	}
}
