package com.bdqn.hibernate.dao;

import java.util.List;

import com.bdqn.hibernate.domain.HtUsers;

public interface IHtUsersDAO {
	public HtUsers findByUName(String uname);
	public boolean addHtUsers(HtUsers users);
	public List<HtUsers> findByLikeUName(String uname);
}
