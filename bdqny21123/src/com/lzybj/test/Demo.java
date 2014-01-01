package com.lzybj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.dao.MyDao;
import com.lzybj.domain.Users;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Users myuser =  (Users)ac.getBean("myuser");
		Users myuser2 = (Users)ac.getBean("myuser2");
		Users myuser3 = (Users)ac.getBean("myuser3");
		MyDao mydao = (MyDao)ac.getBean("mydao");
		Users myuser4 = mydao.findByUid("");
		myuser4.setUname("xxxx");
		System.out.println(myuser4.getUname());
		//Users myuser = new Users();
//		myuser.setUname("laozheng");
//		myuser.setUpwd("qaz123");
//		System.out.println(myuser.getUname());
//		System.out.println(myuser.getUpwd());
	}

}
