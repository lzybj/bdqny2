package com.lzybj.dao.imp;

import com.lzybj.dao.MyDao;
import com.lzybj.domain.Users;

public class MyDaoImp implements MyDao{
	private MyDaoImp(){

	}
	
	public static MyDaoImp getInstance(){
		return new MyDaoImp();
	}
	@Override
	public Users findByUid(String uid) {
		// TODO Auto-generated method stub
		return Users.getInstance();
	}
}
