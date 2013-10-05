package com.bdqn.hibernate.dao;

import java.util.List;

import com.bdqn.hibernate.domain.FilmInfo;
import com.bdqn.hibernate.res.ResObj;

public interface IFilmInfoDAO {
	public boolean insertFilmInfo(FilmInfo filminfo);
	public List<ResObj> selectByParam(String param);
}
