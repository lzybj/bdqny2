package com.lzybj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.hibernate.domain.VoteUser;
import com.lzybj.service.VoteUserService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		VoteUserService vus = (VoteUserService)ac.getBean("vuservice");
		VoteUser vu = vus.isLogin("hidba","qaz123");
		System.out.println(vu.getVuUserName());
	}

}
