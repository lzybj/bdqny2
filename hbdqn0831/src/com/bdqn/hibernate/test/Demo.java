package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//基于QBC查询
		Session session = HibernateSessionFactory.getSession();
		Criteria criteria = session.createCriteria(HosType.class);
//		criteria.add(Restrictions.eq("htid",new BigDecimal(1)));
//		criteria.add(Restrictions.eq("htname","一室一厅"));
		Map<String,Object> params = new HashMap<String, Object>();
		params.put("htid",new BigDecimal(1));
		params.put("htname","一室一卫");
		criteria.add(Restrictions.allEq(params));
		List<HosType> data = criteria.list();
		for (HosType hosType : data) {
			System.out.println(hosType.getHtname());
		}
		HibernateSessionFactory.closeSession();
	}

}
