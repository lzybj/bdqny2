package com.bdqn.hibernate.test;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(TblUsers.class,"u");
		criteria.createCriteria("u.tblTxls","tx");
		criteria.add(Restrictions.eq("tx.txname", "ÕÅÕð"));
		List<TblUsers> data = criteria.list();
		for (TblUsers tblUsers : data) {
			System.out.println(tblUsers.getUname());
		}
		
		
		HibernateSessionFactory.closeSession();
	}

}
