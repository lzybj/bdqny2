package com.lzybj.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import org.hibernate.Query;
import org.hibernate.Session;

import com.lzybj.hibernate.domain.Sms;
import com.lzybj.hibernate.domain.SmsUsers;
import com.lzybj.hibernate.factory.HibernateSessionFactory;

@Entity
public class SmsService {
	public List<Sms> findByResvSmsUsers(SmsUsers su,String page){
		List<Sms> data = new ArrayList<Sms>();
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select sms from Sms sms " +
				"inner join sms.smsUsersByResvUsid resvsu " +
				"where resvsu.uname = ? and sms.smsState = 0";
		Query query = session.createQuery(hsql);
		int pageNum = 1;
		if(page.equals("")){
			pageNum = Integer.parseInt(page);
		}
		query.setFirstResult((pageNum - 1) * 2);
		query.setMaxResults(pageNum * 2); 
		query.setString(0,su.getUname());
		data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}
	public int findByResvSmsUsersNoRead(SmsUsers su){
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select count(sms) from Sms sms " +
				"inner join sms.smsUsersByResvUsid resvsu " +
				"where resvsu.uname = ? and sms.smsState = 0";
		Query query = session.createQuery(hsql);
		query.setString(0,su.getUname());
		int num = ((Long)query.uniqueResult()).intValue();
		HibernateSessionFactory.closeSession();
		return num;
	}
	public static void main(String[] args) {
		SmsService ss = new SmsService();
		SmsUsers su = new SmsUsers();
		su.setUname("ilyj");
		List<Sms> data = ss.findByResvSmsUsers(su,"1");
		for (Sms sms : data) {
			System.out.println(sms.getSmsContent());
		}
	}
}
