package com.lzybj.hibernate.factory;

import com.lzybj.dao.IVoteUserDao;
import com.lzybj.dao.imp.VoteUserDaoImp;

public class DaoFactory {
	public IVoteUserDao getVoteUserDao(){
		return VoteUserDaoImp.getInstance();
	}
}
