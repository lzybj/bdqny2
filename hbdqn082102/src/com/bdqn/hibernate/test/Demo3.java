package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hsql = "select hd.dname,hs.sname,ht.htname,hh.price,su.uname,hh.htime " +
				"from HosHouse hh " +
				"inner join hh.hosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"inner join hh.hosType ht " +
				"inner join hh.sysUser su " +
				"where hd.did in (" +
				"select hd.did " +
				"from HosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"group by hd.did " +
				"having count(hs) > 1" +
				")";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			System.out.println(objects[0] + "," + objects[1]);
		}
		HibernateSessionFactory.closeSession();
	}

}
