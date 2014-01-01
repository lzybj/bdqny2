package com.lzybj.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.lzybj.domain.VoteUser;

public class VoteUserService extends JdbcDaoSupport{
	public VoteUser isLogin(String uname,String upwd){
		String sql = "select * from vote_user where vu_user_name = ?";
		List<Map<String,Object>> rows = this.getJdbcTemplate().queryForList(sql,uname);
		if(rows.size() != 0){
			Map<String,Object> row = rows.get(0);
			String dbpwd = row.get("vu_password").toString();
			if(dbpwd.equals(upwd)){
				return new VoteUser(uname, dbpwd);
			}
		}
		return null;
	}
}
