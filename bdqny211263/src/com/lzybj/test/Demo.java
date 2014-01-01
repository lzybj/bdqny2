package com.lzybj.test;

import java.util.List;

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
		//vus.addVu("jx","qaz123");
//		List<VoteUser> data = vus.findByVuUsername("i");
//		for (VoteUser voteUser : data) {
//			System.out.println(voteUser.getVuUserName());
//		}
		vus.findByUnameForUpdate("jx","110");
	}

}
