package com.lzybj.service;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lzybj.hibernate.domain.Houses;
import com.lzybj.hibernate.domain.Points;
import com.lzybj.hibernate.factory.HibernateSessionFactory;

public class HouseService {
	public boolean faBuHouse(Houses house,Points point){
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		house.setPoints(point);
		point.getHouseses().add(house);
		session.save(point);
		t.commit();
		HibernateSessionFactory.closeSession();
		return true;
	}
}
