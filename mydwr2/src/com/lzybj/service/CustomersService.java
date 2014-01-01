package com.lzybj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.lzybj.domain.Customers;

public class CustomersService extends JdbcDaoSupport{
	public List<Customers> findByAll(){
		List<Customers> data = new ArrayList<Customers>();
		String sql = "select * from customers";
		List<Map<String,Object>> res = this.getJdbcTemplate().queryForList(sql);
		for (Map<String, Object> c : res) {
			int cid = Integer.parseInt(c.get("cid").toString());
			String cname = c.get("cname").toString();
			String cpwd = c.get("cpwd").toString();
			data.add(new Customers(cid,cname,cpwd));
		}
		return data;
	}
}
