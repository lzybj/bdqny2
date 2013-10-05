package com.bdqn.hibernate.test;

import java.sql.CallableStatement;
import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		Connection conn = session.connection();
		CallableStatement cstmt = conn.prepareCall("{call proc_inserttblusers(?,?,?)}");
		//设置输入参数值
		cstmt.setString(1,"jhy");
		cstmt.setString(2,"qaz123");
		//注册输出参数
		cstmt.registerOutParameter(3,oracle.jdbc.OracleTypes.NUMBER);
		//执行存储过程(true:有结果集 false:无结果集)
		System.out.println(cstmt.execute());
		//获得输出参数的值
		System.out.println(cstmt.getInt(3));
		//关闭
		cstmt.close();
		conn.close();
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}
