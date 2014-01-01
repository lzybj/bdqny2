package com.lzybj.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.domain.Customers;
import com.lzybj.service.CustomersService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomersService cs = (CustomersService)ac.getBean("cservice");
		List<Customers> data = cs.findByAll();
		for (Customers customers : data) {
			System.out.println(customers.getCname());
		}
	}

}
