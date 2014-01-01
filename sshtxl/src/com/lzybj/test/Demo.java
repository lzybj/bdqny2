package com.lzybj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.hibernate.domain.Lxrs;
import com.lzybj.hibernate.domain.Users;
import com.lzybj.service.UsersService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UsersService us = (UsersService)ac.getBean("usersservice");
		Users myuser = new Users("lzybj","qaz123");
		Lxrs mylxr = new Lxrs(myuser, myuser.getUname(),"1111111");
		us.addUsers(myuser, mylxr);
	}

}
