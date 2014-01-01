package com.lzybj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.service.CustomersService;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomersService cs = (CustomersService)ac.getBean("custservice");
//		System.out.println(cs.findByCNameFromWS("l").size());
	}
}
