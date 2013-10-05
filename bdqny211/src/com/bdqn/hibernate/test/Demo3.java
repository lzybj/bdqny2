package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.bdqn.hibernate.res.Resutx;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select new com.bdqn.hibernate.domain.TblUsers(u.uname,u.upwd) " +
				"from TblUsers u " +
				"inner join u.tblTxls tx " +
				"where tx.txname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"孙勇");
		List<TblUsers> data = query.list();
		for (TblUsers tblUsers : data) {
			System.out.println(tblUsers.getUname());
			System.out.println(tblUsers.getUpwd());
		}
		HibernateSessionFactory.closeSession();		
	}

}
