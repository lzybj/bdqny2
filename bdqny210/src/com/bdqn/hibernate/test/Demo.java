package com.bdqn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		TblUsers myuser = new TblUsers("金鑫","123456");
		TblTxl lxr = new TblTxl(myuser,"鹏","12321321");
		TblTxl lxr2 = new TblTxl(myuser,"鹏2","1100000");
		TblUsers myuser2 = new TblUsers("老郑","qaz123");
		session.save(myuser);
		session.save(lxr);
		session.save(lxr2);
		session.save(myuser2);
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}
