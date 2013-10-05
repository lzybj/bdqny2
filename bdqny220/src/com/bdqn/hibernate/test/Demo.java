package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from HosType ht where ht.htname = ?";
		//开启查询缓存
		Query query = session.createQuery(hsql).setCacheable(true);
		query.setString(0,"一室一厅");
		List<HosType> data = query.list();
		for (HosType hosType : data) {
			System.out.println(hosType.getHtname());
		}
		Query query2 = session.createQuery(hsql).setCacheable(true);
		query2.setString(0,"一室一厅");
		List<HosType> data2 = query2.list();
		for (HosType hosType : data2) {
			System.out.println(hosType.getHtname());
		}
		HibernateSessionFactory.closeSession();
		Session session2 = HibernateSessionFactory.getSession();
		Query query3 = session2.createQuery(hsql).setCacheable(true);
		query3.setString(0,"一室一厅");
		List<HosType> data3 = query3.list();
		for (HosType hosType : data3) {
			System.out.println(hosType.getHtname());
		}
		HibernateSessionFactory.closeSession();
	}

}
