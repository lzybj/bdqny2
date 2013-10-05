package com.bdqn.hibernate.dao;

import java.util.List;

import com.bdqn.hibernate.domain.FilmType;

public interface IFilmTypeDAO {
	public List<FilmType> selectAll();
	public FilmType selectByID(Integer typeid);
}
