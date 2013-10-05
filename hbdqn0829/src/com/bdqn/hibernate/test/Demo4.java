package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosHouse;
import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String sql = "select {ht.*},{hh.*} " +
				"from hos_type ht " +
				"inner join hos_house hh on hh.htid = ht.htid " +
				"where ht.htid = ?";
		Query query = session.createSQLQuery(sql).addEntity("ht",HosType.class)
				.addEntity("hh",HosHouse.class);
		query.setBigDecimal(0,new BigDecimal(1));
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			HosType ht = (HosType)objects[0];
			HosHouse hh = (HosHouse)objects[1];
			System.out.println(ht.getHtname() + "," + hh.getPrice());
		}
		HibernateSessionFactory.closeSession();
	}

}
