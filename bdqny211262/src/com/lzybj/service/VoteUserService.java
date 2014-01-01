package com.lzybj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.lzybj.domain.VoteUser;

public class VoteUserService extends JdbcDaoSupport{
	public boolean addVu(String uname,String upwd){
		String sql = "insert into vote_user(vu_user_name,vu_password)values(?,?)";
		int flag = this.getJdbcTemplate().update(sql,uname,upwd);
		return true;
	}
	
	public List<VoteUser> findByAll(){
		String sql = "select * from vote_user";
		List<Map<String,Object>> rows = this.getJdbcTemplate().queryForList(sql);
		List<VoteUser> data = new ArrayList<VoteUser>();
		for (Map<String, Object> row : rows) {
			String vuUsername = row.get("vu_user_name").toString();
			String vuPassword = row.get("vu_password").toString();
			data.add(new VoteUser(vuUsername,vuPassword));
		}
		return data;
	}
	
	public VoteUser isLogin(String uname,String upwd){
		String sql = "select * from vote_user where vu_user_name = ?";
		List<Map<String,Object>> rows = this.getJdbcTemplate().queryForList(sql,uname);
		if(rows.size() != 0){
			Map<String,Object> row = rows.get(0);
			if(row.get("vu_password").toString().equals(upwd)){
				return new VoteUser(uname, upwd);
			}
		}
		return null;
	}
	
}
