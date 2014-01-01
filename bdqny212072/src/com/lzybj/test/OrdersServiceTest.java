package com.lzybj.test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.service.OrdersService;

public class OrdersServiceTest extends TestCase{
	private OrdersService ordservice = null;
	/**
	 * 在setUp方法中初始化要测试的类，即实例化该类
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ordservice = (OrdersService)ac.getBean("ordservice");
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testAddOrders2() {
		ordservice.addOrders2();
	}

}
