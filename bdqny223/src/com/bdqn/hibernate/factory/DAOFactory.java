package com.bdqn.hibernate.factory;

import com.bdqn.hibernate.dao.IFilmInfoDAO;
import com.bdqn.hibernate.dao.IFilmTypeDAO;
import com.bdqn.hibernate.dao.imp.FilmInfoDAOImp;
import com.bdqn.hibernate.dao.imp.FilmTypeDAOImp;

public class DAOFactory {
	public static IFilmTypeDAO getFilmTypeDAO(){
		return FilmTypeDAOImp.getInstance();
	}
	public static IFilmInfoDAO getFilmInfoDAO(){
		return FilmInfoDAOImp.getInstance();
	}
}
