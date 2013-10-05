package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.bdqn.hibernate.domain.HosHouse;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(HosHouse.class);
//		criteria.add(Restrictions.ge("price",new Double(1000)));
//		criteria.add(Restrictions.le("price", new Double(2500)));
		criteria.add(Restrictions.between("price",new Double(1000), new Double(2500)));
		List<HosHouse> data = criteria.list();
		for (HosHouse hosHouse : data) {
			System.out.println(hosHouse.getPrice());
		}
		HibernateSessionFactory.closeSession();
	}

}
