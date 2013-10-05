package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.bdqn.hibernate.domain.HosHouse;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Criteria hh = session.createCriteria(HosHouse.class,"hh");
		Criteria hs = hh.createCriteria("hh.hosStreet","hs");
		Criteria hd = hs.createCriteria("hs.hosDistrict","hd");
		hh.add(Restrictions.eq("hd.dname","海淀区"));
		hh.add(Restrictions.between("hh.price",new Double(1000), new Double(3000)));
		hh.addOrder(Order.desc("hh.price"));
		hh.setFirstResult(0);
		hh.setMaxResults(2);
		List<HosHouse> data = hh.list();
		for (HosHouse hosHouse : data) {
			System.out.println(hosHouse.getHosStreet().getHosDistrict().getDname()
					+ "," +hosHouse.getHosStreet().getSname()
					+ "," +hosHouse.getHosType().getHtname()
					+ "," + hosHouse.getPrice());
		}
		HibernateSessionFactory.closeSession();
	}

}
