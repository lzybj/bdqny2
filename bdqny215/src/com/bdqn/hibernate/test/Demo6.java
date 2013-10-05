package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosStreet;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Query query = session.getNamedQuery("findBySid");
		query.setBigDecimal(0,new BigDecimal(1));
		List<HosStreet> data = query.list();
		for (HosStreet hosStreet : data) {
			System.out.println(hosStreet.getSname());
		}
		HibernateSessionFactory.closeSession();
	}

}
