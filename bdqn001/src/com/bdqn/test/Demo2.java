package com.bdqn.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@192.168.240.134:1522:ORCL";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			String sql = "insert into tbl_users(usid,uname,upwd)values(SEQ_TBL_USERS.nextval,'zz','34f85ca80ec353d3052b8a2d3973a0c5')";
			int flag = stmt.executeUpdate(sql);
			if(flag > 0){
				System.out.println("OK");
			}else{
				System.out.println("NO OK!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}

}
