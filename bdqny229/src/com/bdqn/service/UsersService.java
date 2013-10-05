package com.bdqn.service;

public class UsersService {
	public boolean isLogin(String userName,String passWord){
		if(userName.equals("laozheng") && passWord.equals("qaz123")){
			return true;
		}
		return false;
	}
	public boolean register(String userName,String passWord){
		return true;
	}
}
