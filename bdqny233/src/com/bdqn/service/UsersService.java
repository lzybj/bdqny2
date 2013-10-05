package com.bdqn.service;

public class UsersService {
	public boolean login(String userName,String passWord){
		if(userName.equals("zhengbo") && passWord.equals("qaz123")){
			return true;
		}
		return false;
	}
}
