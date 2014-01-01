package com.lzybj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.domain.Employee;
import com.lzybj.domain.Users;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Users myuser = (Users)ac.getBean("myuser2");
//		System.out.println(myuser.getUname());
//		System.out.println(myuser.getUpwd());
		Employee emp = (Employee)ac.getBean("emp2");
		System.out.println(emp.getGroup().getComp().getCompname());
	}

}
