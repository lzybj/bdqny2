package com.lzybj.dao;

import com.lzybj.domain.Users;

public interface MyDao {
	public Users findByUid(String uid);
}
