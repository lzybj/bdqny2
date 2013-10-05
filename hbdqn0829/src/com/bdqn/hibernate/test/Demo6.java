package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ÃüÃû²éÑ¯
		Session session = HibernateSessionFactory.getSession();
//		Query query = session.getNamedQuery("findByHtid");
		Query query = session.getNamedQuery("findBySQL");
		query.setBigDecimal(0,new BigDecimal(1));
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			System.out.println(objects[0] + "," + objects[1]);
		}
		HibernateSessionFactory.closeSession();
	}

}
