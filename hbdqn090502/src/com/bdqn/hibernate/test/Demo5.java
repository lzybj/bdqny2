package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.getNamedQuery("findByUName");
		query.setString(0,"oracle");
		query.setFirstResult(2);
		query.setMaxResults(2);
		List<TblUsers> data = query.list();
		for (TblUsers tblUsers : data) {
			System.out.println(tblUsers.getUname());
		}
		HibernateSessionFactory.closeSession();
	}

}
