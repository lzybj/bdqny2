package com.bdqn.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.bdqn.hibernate.resobj.SmsResObj;

public class SmsService {
	public int findByResvUserNoReadNum(String resvUname){
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select count(sm) " +
				"from Sms sm " +
				"inner join sm.smsUsersByResvUsid su " +
				"where su.uname = ? and sm.smsState = 0";
		Query query = session.createQuery(hsql);
		query.setString(0,resvUname);
		int num = ((Long)query.uniqueResult()).intValue();
		HibernateSessionFactory.closeSession();
		return num;
	}
	
	public List<SmsResObj> findByResvUserNoReadList(String resvUname){
		List<SmsResObj> data = new ArrayList<SmsResObj>();
		String hsql = "select new com.bdqn.hibernate.resobj.SmsResObj" +
				"(" +
				"sm.smsId,su_send.uname,su_resv.uname,sm.smsContent,sm.smsDate" +
				") " +
				"from Sms sm " +
				"inner join sm.smsUsersByResvUsid su_resv " +
				"inner join sm.smsUsersBySendUsid su_send " +
				"where su_resv.uname = ? and sm.smsState = 0 " +
				"order by sm.smsDate desc";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		query.setString(0,resvUname);
		data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}
	
	
	public static void main(String[] args) {
		SmsService ss = new SmsService();
//		System.out.println(ss.findByResvUserNoReadNum("ilyj"));
		List<SmsResObj> data = ss.findByResvUserNoReadList("ilyj");
		for (SmsResObj smsResObj : data) {
			System.out.println(smsResObj.getSmsContent());
		}
	}
}
