package com.lzybj.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.Lxrs;
import com.lzybj.hibernate.domain.Users;

public class UsersService extends HibernateDaoSupport{
	/**
	 * 添加一个用户的同时，将该用户作为自己的第一个联系人
	 */
	public boolean addUsers(Users myuser,Lxrs mylxr){
		myuser.getLxrses().add(mylxr);
		this.getHibernateTemplate().save(myuser);
		return true;
	}
	
	public Users isLogin(Users myuser){
		String hsql = "from Users u where u.uname = ?";
		List<Users> data = this.getHibernateTemplate().find(hsql,myuser.getUname());
		if(data.size() != 0){
			Users u = data.get(0);
			if(u.getUpwd().equals(myuser.getUpwd())){
				return u;
			}
		}
		return null;
	}
	
	
}
