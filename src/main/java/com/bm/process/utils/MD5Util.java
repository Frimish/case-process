package com.bm.process.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 
* @Package com.bm.process.utils 
* @Title: MD5Util.java   
* @Description: md5 加密  
* @author Frimish  
* @date 2018年6月7日 上午10:09:00
* @version V1.0
 */
public class MD5Util {

	/**
	 * 
	* @Title: md5of32 
	* @Description: md5 加密 32位
	* @param @param str
	* @param @return   
	* @return String  
	* @throws
	 */
	public static String md5of32(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte[] byteDigest = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < byteDigest.length; offset++) {
				i = byteDigest[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			return buf.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 
	* @Title: str2MD5Of16 
	* @Description:  md5 加密 32位
	* @param @param sourceStr
	* @param @return   
	* @return String  
	* @throws
	 */
	public static String str2MD5Of16(String sourceStr) {
		String result = md5of32(sourceStr);

		if (StrUtils.isNullOrEmpty(result) || result.length() < 32) {
			throw new RuntimeException("MD5加密失败");
		}

		return result.substring(8, 24);
	}

}
