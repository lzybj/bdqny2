package com.bdqn.hibernate.test;

import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 查找老郑联系人下的马吉宁的电话
		 */
		Session session = HibernateSessionFactory.getSession();
		//查找老郑用户
		String hsql = "from TblUsers u where u.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"老郑");
		TblUsers myuser = (TblUsers)query.uniqueResult();
		//获得老郑下的所有联系人
		Set<TblTxl> lxrs = myuser.getTblTxls();
		//遍历联系人集合,找出马吉宁对应TblTxl对象
		for (TblTxl tblTxl : lxrs) {
			if(tblTxl.getTxname().equals("马吉宁")){
				System.out.println(tblTxl.getTxtel());
			}
		}
		HibernateSessionFactory.closeSession();
	}

}
