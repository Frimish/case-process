package com.bm.process.utils;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

/**
 * 
* @Package com.bm.process.utils 
* @Title: Base64Util.java   
* @Description: TODO  此加密解密方法 只用于 前台加密后台解密，或 后台加密 前台解密,并且加密数据不存数据库
* @author steven  
* @date 2017年9月18日 上午11:04:35
* @version V1.0
 */
public class Base64Utils {
	private static final String UTF_8 = "UTF-8";
	/**
	 * 加密前缀
	 * 
	 */
	private static final String base64_prefix = "crm_admin_base64_";

	/**
	 * 对给定的字符串进行base64解码操作 
	 */
	public static String decode(String inputData) {
		try {
			if (null == inputData) {
				return null;
			}
			String data = new String(Base64.decodeBase64(inputData.getBytes(UTF_8)), UTF_8);
			return data.replace(base64_prefix, "");
		} catch (UnsupportedEncodingException e) {
		}

		return null;
	}

	/**
	 * 对给定的字符串进行base64加密操作 
	 */
	public static String encode(String inputData) {
		try {
			if (null == inputData) {
				return null;
			}
			return new String(Base64.encodeBase64((base64_prefix + inputData).getBytes(UTF_8)), UTF_8);
		} catch (UnsupportedEncodingException e) {
		}

		return null;
	}
}
