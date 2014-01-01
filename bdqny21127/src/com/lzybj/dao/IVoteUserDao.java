package com.lzybj.dao;

import com.lzybj.hibernate.domain.VoteUser;

public interface IVoteUserDao{
	public VoteUser findByVuUserName(String uname);
}
