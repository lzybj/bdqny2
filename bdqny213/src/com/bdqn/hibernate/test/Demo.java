package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosHouse;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from HosHouse";
		Query query = session.createQuery(hsql);
		query.setFirstResult(5); //用此方法设置当前页显示的起始索引
		query.setMaxResults(5);//每页显示的条数
		List<HosHouse> myhouse = query.list();
		System.out.println(myhouse.size());
		for (HosHouse hosHouse : myhouse) {
			System.out.println(hosHouse.getHmid());
		}
		HibernateSessionFactory.closeSession();
	}

}
