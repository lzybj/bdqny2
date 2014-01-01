package com.lzybj.test;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lzybj.service.ProductsService;

public class ProductsServiceTest extends TestCase{
	private ProductsService ps = null;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		ps = new ProductsService();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testFindByProdid() {
		ps.findByProdid("2");
	}

}
