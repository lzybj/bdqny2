package com.lzybj.factory;

import com.lzybj.dao.MyDao;
import com.lzybj.dao.imp.MyDaoImp;
import com.lzybj.domain.Users;

public class MyFactory {
	public Users getUsers(){
		System.out.println("通过工厂类获得对象实例!");
		return Users.getInstance();
	}
	
	public MyDao getMyDao(){
		return MyDaoImp.getInstance();
	}
	
}
