package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hsql = "select su.uname,hd.dname,hs.sname,ht.htname,hh.price,hh.htime " +
				"from HosHouse hh " +
				"inner join hh.hosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"inner join hh.hosType ht " +
				"inner join hh.sysUser su " +
				"where su.uname = ? " +
				"order by hh.htime desc";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		query.setString(0,"ÕÅÈý");
		query.setFirstResult(0);
		query.setMaxResults(2);
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			System.out.println(objects[0] + "," + objects[4] + "," + objects[5]);
		}
		HibernateSessionFactory.closeSession();
	}

}
