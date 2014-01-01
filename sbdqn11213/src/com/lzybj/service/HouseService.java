package com.lzybj.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.lzybj.hibernate.domain.HosHouse;
import com.lzybj.hibernate.factory.HibernateSessionFactory;

public class HouseService {
	public List<HosHouse> findByUName(String uname){
		String hsql = "from HosHouse hh where hh.sysUser.uname like ?";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		query.setString(0, "%"+ uname +"%");
		List<HosHouse> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}
	public static void main(String[] args) {
		HouseService hs = new HouseService();
		List<HosHouse> data = hs.findByUName("ÕÅÈý");
		for (HosHouse hosHouse : data) {
			System.out.println(hosHouse.getHosStreet().getHosDistrict().getDname());
		}
	}
}
