package com.lzybj.struts.converter;

import java.util.Map;

import com.lzybj.hibernate.domain.Points;

import ognl.DefaultTypeConverter;

public class PointsTypeConverter extends DefaultTypeConverter{
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		// TODO Auto-generated method stub
		if(toType == Points.class){
			String[] pointValue = (String[])value;
			Points mypoint = new Points(new Double(pointValue[0]),new Double(pointValue[1]));
			return mypoint;
		}
		return value;
	}
}
