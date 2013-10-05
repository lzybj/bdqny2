package com.bdqn.hibernate.test;

import java.sql.Connection;
import java.sql.Statement;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		String[] sqlArr = new String[3];
		for (int i = 0; i < sqlArr.length; i++) {
			sqlArr[i] = "insert into sys_user(usid,uname,upassword)" +
					"values(SEQ_SYS_USERS.nextval,'xxx"+ i +"','sfsdfsd')";
		}
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		boolean isOK = true;
		try {
			conn = session.connection();
			stmt = conn.createStatement();
			for (int i = 0; i < sqlArr.length; i++) {
				stmt.addBatch(sqlArr[i]);
			}
			int[] flag = stmt.executeBatch();
			for (int i = 0; i < flag.length; i++) {
				if(flag[i] < 0){
					isOK = false;
					break;
				}
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		if(isOK){
			t.commit();
		}else{
			t.rollback();
		}
		HibernateSessionFactory.closeSession();
	}

}
