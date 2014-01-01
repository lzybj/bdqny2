package com.lzybj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.domain.Employee;
import com.lzybj.domain.Group;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Group g = (Group)ac.getBean("group");
//		System.out.println(g.getGname());
//		System.out.println(g.getComp().getCompname());
		Employee emp = (Employee)ac.getBean("emp");
		System.out.println(emp.getGroup().getGname());
	}

}
