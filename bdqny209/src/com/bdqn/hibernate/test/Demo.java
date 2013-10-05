package com.bdqn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.HStuTec;
import com.bdqn.hibernate.domain.HStuTecId;
import com.bdqn.hibernate.domain.HStudent;
import com.bdqn.hibernate.domain.HTeacher;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		HStudent stu = new HStudent("金鑫","男");
		HTeacher tec = new HTeacher("老陈");
		HStuTecId id =  new HStuTecId(stu, tec);
		HStuTec stutec = new HStuTec(id, tec, stu);
		session.save(stu);
		session.save(tec);
		session.save(stutec);
		
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}
