package com.lzybj.service;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;

public class UsersService {
	private DataSource ds = null;
	
	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public boolean isLogin(String uname,String upwd){
		try {
			Connection conn = ds.getConnection();
			Statement stmt = conn.createStatement();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}
}
