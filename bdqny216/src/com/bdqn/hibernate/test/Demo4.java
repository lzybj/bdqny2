package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.bdqn.hibernate.domain.HosHouse;
import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(HosType.class);
//		criteria.add(Restrictions.eq("htid",new BigDecimal(1)));
//		criteria.add(Restrictions.eq("htname","一室一卫"));
		Map<String,Object> tj = new HashMap<String, Object>();
		tj.put("htid",new BigDecimal(1));
		tj.put("htname","一室卫");
//		criteria.add(Restrictions.allEq(tj));
		criteria.add(Restrictions.or(
				Restrictions.allEq(tj),
				Restrictions.eq("htid",new BigDecimal(2))
				));
		List<HosType> data = criteria.list();
		for (HosType hosType : data) {
			System.out.println(hosType.getHtname());
//			Set<HosHouse> houses = hosType.getHosHouses();
//			for (HosHouse myhouse : houses) {
//				System.out.println(myhouse.getPrice());
//			}
		}
		HibernateSessionFactory.closeSession();
	}

}
