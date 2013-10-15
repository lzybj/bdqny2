package com.bdqn.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HosHouse;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class HosHouseService {
	public List<HosHouse> findByAllForFY(String page){
		List<HosHouse> data = new ArrayList<HosHouse>();
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from HosHouse";
		Query query = session.createQuery(hsql);
		query.setFirstResult((Integer.parseInt(page) - 1) * 4);
		query.setMaxResults(4);
		data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}
	public List<String> getPageCountList(){
		List<String> pageCount = new ArrayList<String>();
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select count(hh) from HosHouse hh";
		Query query = session.createQuery(hsql);
		int count = ((Long)query.uniqueResult()).intValue();
		HibernateSessionFactory.closeSession();
		int pageNum = 1;
		if(count % 4 == 0){
			pageNum = count / 4;
		}else{
			pageNum = count / 4 + 1;
		}
		for(int i = 1;i <= pageNum;i++){
			pageCount.add("" + i);
		}
		return pageCount;
	}
	public static void main(String[] args) {
		HosHouseService hhs = new HosHouseService();
		List<HosHouse> data = hhs.findByAllForFY("1");
		for (HosHouse hh : data) {
			System.out.println(hh.getHosStreet().getHosDistrict().getDname() 
					+ ","+ hh.getHosStreet().getSname()
					+ "," + hh.getHosType().getHtname()
					+ "," + hh.getPrice()
					+ "," + hh.getSysUser().getUname()
					+ "," + hh.getHtime());
		}
	}
}
