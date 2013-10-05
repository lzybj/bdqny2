package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.bdqn.hibernate.res.HosResObj;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select new com.bdqn.hibernate.res.HosResObj" +
				"(hd.dname,hs.sname,ht.htname," +
				"hh.price,hh.topic,hh.contents) " +
				"from HosHouse hh " +
				"inner join hh.hosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"inner join hh.hosType ht " +
				"inner join hh.sysUser su " +
				"where su.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"张三");
//		query.setFirstResult(2);
//		query.setMaxResults(2);
		List<HosResObj> data = query.list();
		for (HosResObj hosResObj : data) {
			System.out.println(hosResObj.getDname()
					+ "," + hosResObj.getSname() + 
					"," + hosResObj.getHtname() + 
					"," + hosResObj.getPrice());
		}
		HibernateSessionFactory.closeSession();
	}

}
