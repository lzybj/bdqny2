package com.bdqn.hibernate.servlce;

import java.util.List;

import com.bdqn.hibernate.dao.IFilmInfoDAO;
import com.bdqn.hibernate.dao.IFilmTypeDAO;
import com.bdqn.hibernate.domain.FilmInfo;
import com.bdqn.hibernate.domain.FilmType;
import com.bdqn.hibernate.factory.DAOFactory;
import com.bdqn.hibernate.res.ResObj;

public class FilmInfoService {
	public boolean addFilmInfo(String filmname,
			String typeid,String actor,
			String director,String ticketprice){
		/**
		 * 1.根据电影类型ID，获得电影类型对象(FilmType)
		 * 2.实例化电影信息对象(FilmInfo)
		 * 3.调用DAO
		 */
		IFilmTypeDAO ftDao = DAOFactory.getFilmTypeDAO();
		FilmType ft = ftDao.selectByID(new Integer(typeid));
		FilmInfo fi = new FilmInfo(ft, filmname, actor, director, new Double(ticketprice));
		IFilmInfoDAO fiDao = DAOFactory.getFilmInfoDAO();
		if(!fiDao.insertFilmInfo(fi)){
			return false;
		}
		return true;
	}
	
	public List<ResObj> findByParam(String filmname,
			String typeid,String actor,
			String director,String bprice,String eprice){
		String param = "";
		if(!filmname.equals("")){
			param = param + " and fi.filmname like '%"+ filmname +"%'";
		}
		
		if(!typeid.equals("0")){
			param = param + " and ft.typeid = " + typeid;			
		}
		
		if(!actor.equals("")){
			param = param + " and fi.actor like '%"+ actor +"%'";						
		}
		
		if(!director.equals("")){
			param = param + " and fi.director like '%"+ director +"%'";
		}
		
		if(!bprice.equals("")){
			param = param + " and fi.ticketprice >=" + bprice;						
		}
		if(!eprice.equals("")){
			param = param + " and fi.ticketprice <=" + eprice;									
		}
		List<ResObj> data = DAOFactory.getFilmInfoDAO().selectByParam(param);
		return data;
	}
}
