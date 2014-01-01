package com.lzybj.service;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class VoteUserService extends JdbcDaoSupport{
	public boolean addVu(String uname,String upwd){
		String sql = "insert into vote_user(vu_user_name,vu_password)values(?,?)";
		int flag = this.getJdbcTemplate().update(sql,uname,upwd);
		System.out.println(flag);
		return true;
	}
}
