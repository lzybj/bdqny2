package com.bdqn.hibernate.test;

import java.util.List;
import java.util.Map;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosDistrict;
import com.bdqn.hibernate.domain.HosStreet;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select hs.sname sname,hd.dname dname " +
				"from hos_street hs " +
				"inner join hos_district hd on hd.did = hs.sdid";
		Session session = HibernateSessionFactory.getSession();
		SQLQuery query = session.createSQLQuery(sql);
		query.addScalar("sname",Hibernate.STRING);
		query.addScalar("dname",Hibernate.STRING);
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			System.out.println(objects[0] + "," + objects[1]);
		}
		HibernateSessionFactory.closeSession();
	}

}
