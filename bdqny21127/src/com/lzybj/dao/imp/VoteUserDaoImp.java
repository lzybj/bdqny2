package com.lzybj.dao.imp;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.dao.IVoteUserDao;
import com.lzybj.hibernate.domain.VoteUser;

public class VoteUserDaoImp extends HibernateDaoSupport implements IVoteUserDao{
	private VoteUserDaoImp(){
	}
	public static VoteUserDaoImp getInstance(){
		return new VoteUserDaoImp();
	}
	public VoteUser findByVuUserName(String uname) {
		// TODO Auto-generated method stub
		String hsql = "from VoteUser vu where vu.vuUserName = ?";
		List<VoteUser> data = this.getHibernateTemplate().find(hsql,uname);
		if(data.size() != 0){
			return data.get(0);
		}
		return null;
	}
}
