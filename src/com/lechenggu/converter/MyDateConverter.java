package com.lechenggu.converter;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

public class MyDateConverter extends StrutsTypeConverter {
	SimpleDateFormat[] sdfs=new SimpleDateFormat[]{
			new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyy/MM/dd"),
			new SimpleDateFormat("yyyy年MM月dd日"),
	};
			
 
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		if(arg1!=null&&arg1.length>0){
			String inputValue=arg1[0];
			Date ret=null;
			for(int i=0;i<sdfs.length;i++){
				try{
					ret=new Date(sdfs[i].parse(inputValue).getTime());
					break;
					
				}catch(Exception e){
					 e.printStackTrace();
				}
			}
			
			if(ret==null){
				throw new TypeConversionException("日期非法格式");
			}else {
				return ret;
			}
		} 
		return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		 
		return sdfs[0].format(arg1);
	}

}
