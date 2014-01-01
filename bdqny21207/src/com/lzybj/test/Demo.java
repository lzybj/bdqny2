package com.lzybj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.service.OrdersService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		OrdersService ordservice = (OrdersService)ac.getBean("ordservice");
		ordservice.addOrders();
	}

}
