package com.lzybj.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.domain.VoteUser;
import com.lzybj.service.VoteUserService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		VoteUserService vus = (VoteUserService)ac.getBean("vuservice");
//		List<VoteUser> data = vus.findByAll();
//		for (VoteUser voteUser : data) {
//			System.out.println(voteUser.getVuUsername());
//		}
		VoteUser vu = vus.isLogin("lzybj","qaz123");
		System.out.println(vu.getVuUsername());
	}

}
