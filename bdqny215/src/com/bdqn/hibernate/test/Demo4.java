package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosDistrict;
import com.bdqn.hibernate.domain.HosStreet;
import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select {hs.*},{hd.*} " +
				"from hos_street hs " +
				"inner join hos_district hd on hd.did = hs.sdid";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createSQLQuery(sql)
				.addEntity("hs",HosStreet.class)
				.addEntity("hd",HosDistrict.class);
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			System.out.println(((HosStreet)objects[0]).getSname()+ "," + ((HosDistrict)objects[1]).getDname());
		}
		HibernateSessionFactory.closeSession();
	}

}
