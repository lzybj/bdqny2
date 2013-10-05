package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from TblTxl tx where tx.txname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"马吉宁");
		List<TblTxl> data = query.list();
		for (TblTxl tblTxl : data) {
			System.out.println(tblTxl.getTblUsers().getUname());
		}
		HibernateSessionFactory.closeSession();
	}

}
