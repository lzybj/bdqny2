package com.lzybj.service;

import com.lzybj.domain.Users;

public class UsersService {
	public boolean reguser(Users myuser){
		System.out.println(myuser.getUname() + "---" + myuser.getUsex() + "---" + myuser.getUemail());
		return true;
	}
}
