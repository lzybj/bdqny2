package com.lzybj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.lzybj.domain.Customer;

public class CustomersService extends JdbcDaoSupport{
	public List<Customer> findByCName(String cname){
		String sql = "select * from customers where cname like ?";
        List<Customer> cuts = new ArrayList<Customer>();
		List<Map<String,Object>> data = this.getJdbcTemplate().queryForList(sql,"%"+ cname +"%");
		for (Map<String, Object> row : data) {
			int cid = Integer.parseInt(row.get("cid").toString());
			String db_cname = row.get("cname").toString();
			String db_cpwd = row.get("cpwd").toString();
			cuts.add(new Customer(cid, db_cname, db_cpwd));
		}
		return cuts;
	}
	public boolean addCustomer(String cname,String cpwd){
		String sql = "insert into Customers(cid,cname,cpwd)values(seq_customers.nextval,?,?)";
		this.getJdbcTemplate().update(sql, cname,cpwd);
		return true;
	}
}
