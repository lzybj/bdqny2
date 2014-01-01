package com.lzybj.test;

import static org.junit.Assert.*;

import java.util.List;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.hibernate.domain.Customers;
import com.lzybj.service.CustomersService;

public class CustomersServiceTest extends TestCase{
	private CustomersService cs = null;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		cs = (CustomersService)ac.getBean("myservice");
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFindByCname() {
		List<Customers> data = cs.findByCname("l");
		System.out.println(data.size());
	}

}
