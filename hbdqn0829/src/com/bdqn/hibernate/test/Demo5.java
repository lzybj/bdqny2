package com.bdqn.hibernate.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		String sql = "insert into sys_user(usid,uname,upassword)values(SEQ_SYS_USERS.nextval,?,?)";
		//绕过hibernate框架，直接调用jdbc
		Connection conn = session.connection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,"yyyy");
		pstmt.setString(2,"sdfsdfs");
		int flag = pstmt.executeUpdate();
		System.out.println("成功！");
		pstmt.close();
		conn.close();
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}
