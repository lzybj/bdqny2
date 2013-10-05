package com.bdqn.hibernate.test;

import java.util.List;

import com.bdqn.hibernate.dao.IHosStreetDAO;
import com.bdqn.hibernate.domain.HosStreet;
import com.bdqn.hibernate.factory.DAOFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IHosStreetDAO dao = DAOFactory.getStreetDAO();
		List<HosStreet> data = dao.selectByDid("1");
		for (HosStreet hosStreet : data) {
			System.out.println(hosStreet.getSname());
		}
	}

}
