package com.lzybj.struts.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import ognl.DefaultTypeConverter;

public class BirthdayTypeConverter extends DefaultTypeConverter {
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		// TODO Auto-generated method stub
		if(toType == Date.class){
			String[] myparams = (String[])value;
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			try {
				return sdf.parseObject(myparams[0]);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
	}
}
