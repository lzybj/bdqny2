package com.bdqn.hibernate.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from TblUsers u where u.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"¿œ÷£");
		List<TblUsers> data = query.list();
//		Iterator<TblUsers> its = query.iterate();
//		while(its.hasNext()){
//			TblUsers my = its.next();
//			Set<TblTxl> lxrs = my.getTblTxls();
//			for (TblTxl tblTxl : lxrs) {
//				System.out.println(tblTxl.getTxname());
//			}
//		}
//		
		HibernateSessionFactory.closeSession();
	}

}
