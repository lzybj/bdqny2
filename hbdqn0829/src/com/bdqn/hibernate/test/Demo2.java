package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String sql = "select * from hos_type where htid = ?";
		Query query = session.createSQLQuery(sql).addEntity(HosType.class);
		query.setBigDecimal(0,new BigDecimal(1));
		List<HosType> data = query.list();
		for (HosType hosType : data) {
			System.out.println(hosType.getHtname());
		}
		HibernateSessionFactory.closeSession();
	}

}
