package com.bdqn.hibernate.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from HosType";
		Query query = session.createQuery(hsql);
//		List<HosType> data = query.list();
//		for (HosType hosType : data) {
//			System.out.println(hosType.getHtname());
//		}
		Iterator<HosType> data = query.iterate();
		while (data.hasNext()) {
			HosType ht = data.next();
			System.out.println(ht.getHtname());
			
		}
		HibernateSessionFactory.closeSession();
	}

}
