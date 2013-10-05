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
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select hd.dname,hs.sname,ht.htname,hh.price,su.uname,hh.htime " +
				"from SysUser su " +
				"left join su.hosHouses hh " +
				"left join hh.hosStreet hs " +
				"left join hs.hosDistrict hd " +
				"left join hh.hosType ht ";
		Query query = session.createQuery(hsql);
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			System.out.println(objects[0]+"," + objects[1] + "," + objects[2] + "," + objects[3] + "," + objects[4]);
		}
		HibernateSessionFactory.closeSession();
	}

}
