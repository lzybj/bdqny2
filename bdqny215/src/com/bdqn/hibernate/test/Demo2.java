package com.bdqn.hibernate.test;

import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosHouse;
import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String sql = "select ht.htname hn,hh.price hp from hos_type ht inner join hos_house hh on hh.htid = ht.htid";
		SQLQuery query = session.createSQLQuery(sql);
		query.addScalar("hn",Hibernate.STRING);
		query.addScalar("hp",Hibernate.FLOAT);
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
		HibernateSessionFactory.closeSession();
	}

}
