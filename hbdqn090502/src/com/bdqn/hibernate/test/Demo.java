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
		
		TblUsers myuser = (TblUsers)session.get(TblUsers.class,new Integer(208));
		
		session.delete(myuser);
		
//		TblUsers myUser = new TblUsers("Ê¢ÉÙÁú","qaz123");
//		session.delete(myUser);
//		TblTxl mylxr = new TblTxl(myUser,"Íõ¿î","111");
//		myUser.getTblTxls().add(mylxr);
//		session.save(myUser);
//		session.save(mylxr);
		
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}
