package com.bdqn.hibernate.test;

import java.math.BigDecimal;
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
		//Ò»¼¶»º´æ(get/load/)
		Session session = HibernateSessionFactory.getSession();
		HosType ht = (HosType)session.get(HosType.class,new BigDecimal(1));
		System.out.println(ht.getHtname());
//		String hsql = "from HosType ht where ht.htid = 1";
//		Query query = session.createQuery(hsql);
//		Iterator data = query.iterate();
//		Iterator data2 = query.iterate();
		HibernateSessionFactory.closeSession();
		Session session2 = HibernateSessionFactory.getSession();
		HosType ht2 = (HosType)session2.get(HosType.class,new BigDecimal(1));
		System.out.println(ht2.getHtname());
		HibernateSessionFactory.closeSession();
	}

}
