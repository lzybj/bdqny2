package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String sql = "select ht.htid htid,ht.htname htname from hos_type ht " +
				"where ht.htid = ?";
		sql = "select ht.htname htname,hh.price price from hos_type ht " +
				"inner join hos_house hh on hh.htid = ht.htid " +
				"where ht.htid = ?";
		//部分属性查询
		SQLQuery query = session.createSQLQuery(sql);
		query.setBigDecimal(0,new BigDecimal(1));
		query.addScalar("htname",Hibernate.STRING);
//		query.addScalar("htid",Hibernate.INTEGER);
		query.addScalar("price",Hibernate.STRING);
		List<Object[]> data = query.list();
		for (Object[] object : data) {
			System.out.println(object[0] + "," + object[1]);
		}
		HibernateSessionFactory.closeSession();
	}

}
