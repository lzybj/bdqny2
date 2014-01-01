package com.lzybj.service;

import com.lzybj.dao.IVoteUserDao;
import com.lzybj.hibernate.domain.VoteUser;

public class VoteUserService {
	private IVoteUserDao voteUserDao = null;
	public IVoteUserDao getVoteUserDao() {
		return voteUserDao;
	}
	public void setVoteUserDao(IVoteUserDao voteUserDao) {
		this.voteUserDao = voteUserDao;
	}


	public VoteUser isLogin(String uname,String upwd){
		VoteUser vu = voteUserDao.findByVuUserName(uname);
		if(vu != null){
			if(vu.getVuPassword().equals(upwd)){
				return vu;
			}			
		}
		return null;
	}
}
