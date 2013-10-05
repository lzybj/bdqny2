package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.ViHosRes;
import com.bdqn.hibernate.domain.ViHosResId;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from ViHosRes res where res.id.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"张三");
		List<ViHosRes> data = query.list();
		for (ViHosRes viHosRes : data) {
			ViHosResId id = viHosRes.getId();
			System.out.println(id.getHtname()
					+ "," + id.getUname()
					+ "," + id.getDname()
					+ "," + id.getSname());
		}
		HibernateSessionFactory.closeSession();
	}

}
