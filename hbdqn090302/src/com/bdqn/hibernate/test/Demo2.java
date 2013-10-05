package com.bdqn.hibernate.test;

import java.util.Iterator;
import java.util.List;

import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

import org.hibernate.Query;
import org.hibernate.Session;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 1.iterate方式，与list不同，在于iterate方式，是先取主键ID，而后，根据需要获取相关其他
		 *   属性时，在执行根据主键ID查询其他值，也就是说，他至少要执行2次.
		 * 2.一级缓存与iterate方式关系，从某种意义上说，iterate方式，支持对于重复获取ID值的缓存机制.
		 *   注意：仅支持根据主键为条件的查询
		 */
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from TblUsers t where t.usid = 100";
		Query query = session.createQuery(hsql);
//		List<TblUsers> data = query.list();
		Iterator<TblUsers> data = query.iterate();
		while (data.hasNext()) {
			TblUsers myuser = data.next();
			System.out.println(myuser.getUname());
		}
		Query query2 = session.createQuery(hsql);
//		List<TblUsers> data2 = query2.list();
		Iterator<TblUsers> data2 = query2.iterate();
		while (data2.hasNext()) {
			TblUsers myuser = data2.next();
			System.out.println(myuser.getUname());
		}
		HibernateSessionFactory.closeSession();
	}

}
