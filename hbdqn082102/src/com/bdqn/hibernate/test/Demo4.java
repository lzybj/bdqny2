package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.ViHosMyres;
import com.bdqn.hibernate.domain.ViHosMyresId;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select myvi.id from ViHosMyres myvi where myvi.id.dname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"º£µíÇø");
		List<ViHosMyresId> data = query.list();
		for (ViHosMyresId id : data) {
//			ViHosMyresId id = (ViHosMyresId)object;
			System.out.println(id.getDname() + "," + id.getPrice());
		}
		HibernateSessionFactory.closeSession();
	}

}
