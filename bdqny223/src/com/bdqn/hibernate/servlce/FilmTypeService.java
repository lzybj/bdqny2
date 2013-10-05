package com.bdqn.hibernate.servlce;

import java.util.List;

import com.bdqn.hibernate.domain.FilmType;
import com.bdqn.hibernate.factory.DAOFactory;

public class FilmTypeService {
	public List<FilmType> findByAll(){
		return DAOFactory.getFilmTypeDAO().selectAll();
	}
}
