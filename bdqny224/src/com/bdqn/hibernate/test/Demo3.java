package com.bdqn.hibernate.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String sql = "{call proc_getlxr(?,?,?)}";
		Connection conn = session.connection();
		CallableStatement cstmt = conn.prepareCall(sql);
		cstmt.setString(1,"老郑12321");
		cstmt.registerOutParameter(2,oracle.jdbc.OracleTypes.NUMBER);
		cstmt.registerOutParameter(3,oracle.jdbc.OracleTypes.CURSOR);
		cstmt.execute();
		int state = cstmt.getInt(2);
		if(state == 0){
			ResultSet rs = (ResultSet)cstmt.getObject(3);
			while(rs.next()){
				System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3));
			}
			rs.close();
		}else{
			System.out.println("对不起，您所查找的用户或联系人不存在！");
		}
		cstmt.close();
		conn.close();
		HibernateSessionFactory.closeSession();
	}

}
