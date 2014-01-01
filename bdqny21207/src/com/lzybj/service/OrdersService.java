package com.lzybj.service;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class OrdersService extends JdbcDaoSupport{
	
	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public boolean addOrders(){
		String sql = "insert into orders(ordid,cusid,orddelivername,orddeliveraddr,ordstatus)values(seq_orders.nextval,2,'王俊鹏','济南泉城广场','送货')";
		String sql2 = "insert into orderdetails(odid,ordid)values(1,1)";
		this.getJdbcTemplate().update(sql);
		this.getJdbcTemplate().update(sql2);
		return true;
	}
}
