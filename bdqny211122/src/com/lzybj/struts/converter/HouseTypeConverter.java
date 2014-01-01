package com.lzybj.struts.converter;

import java.util.Map;

import com.lzybj.hibernate.domain.Houses;

import ognl.DefaultTypeConverter;

public class HouseTypeConverter extends DefaultTypeConverter {
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		// TODO Auto-generated method stub
		if(toType == Houses.class){
			String[] houseValue = (String[])value;
			Houses myhouse = new Houses(houseValue[0],houseValue[1],houseValue[2],new Double(houseValue[3]));
			return myhouse;
		}
		return value;
	}
}
