package com.bm.process.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @Package com.bm.process.utils 
* @Title: DateUtils.java   
* @Description: TODO  
* @author steven  
* @date 2018年6月1日 上午11:09:55
* @version V1.0
 */
public class DateUtils {
	/**
	 * 
	* @Title: formatDate 
	* @Description: 时间格式化 To String
	* @param @param date
	* @param @return
	* @param @throws ParseException   
	* @return String  
	* @throws
	 */
	public static String formatDate(Date date) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	/**
	* Title: formatDate 
	* Description: 时间格式化 To String
	* @param date
	* @param format
	* @return
	* @throws ParseException   
	* String
	* 
	 */
	public static String formatDate(Date date, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	* @Title: parse 
	* @Description: 时间格式化 To Date
	* @param @param strDate
	* @param @return
	* @param @throws ParseException   
	* @return Date  
	* @throws
	 */
	public static Date parse(String strDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.parse(strDate);
	}

	/**
	* Title: parse 
	* Description: 时间格式化 To Date
	* @param strDate
	* @param format
	* @return
	* @throws ParseException   
	* Date
	 */
	public static Date parse(String strDate, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(strDate);
	}
}
