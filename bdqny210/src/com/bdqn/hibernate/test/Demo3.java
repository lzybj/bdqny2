package com.bdqn.hibernate.test;

import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from TblUsers u where u.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"老郑");
		TblUsers myuser = (TblUsers)query.uniqueResult();
		
//		System.out.println("我的联系人共计：" + myuser.getTblTxls().size());//此处如果为立即索引或延长索引都能够查出		
//		Set<TblTxl> lxrs = myuser.getTblTxls();
//		for (TblTxl tblTxl : lxrs) {
//			System.out.println(tblTxl.getTxname());
//			System.out.println(tblTxl.getTxtel());
//		}
		HibernateSessionFactory.closeSession();
//		System.out.println("我的联系人共计：" + myuser.getTblTxls().size());//此处只能是立即索引，才能查出数据
	}

}
