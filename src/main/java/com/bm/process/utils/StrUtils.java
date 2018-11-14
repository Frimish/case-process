package com.bm.process.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
* @Package com.bm.process.utils 
* @Title: StrUtils.java   
* @Description: String工具  
* @author steven  
* @date 2018年6月1日 上午11:06:05
* @version V1.0
 */
public final class StrUtils extends StringUtils implements java.io.Serializable {
	/**
	 * @Fields serialVersionUID : TODO
	 */

	private static final long serialVersionUID = 1L;

	/**
	 * 判断字符串是否为空
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isNullOrEmpty(String value) {
		return value == null || value.isEmpty();
	}

	/**
	 * 创建UUID
	 * 
	 * @return
	 */
	public static String newUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * @Title: getParamsListFromExpression @Description:
	 * 根据逻辑表达式返回参数列表 @param @param expression @param @return @return
	 * List<String> @throws
	 */
	public static List<String> getParamsListFromExpression(String expression) {
		List list = new ArrayList();
		// 提取字符串中所有的英文
		expression = expression.replaceAll("[^a-z^A-Z^0-9]", " ");
		// 返回英文数组
		String[] split = expression.split("[\\s\\.;',]");
		for (String string : split) {
			if (string.length() > 0 && !list.contains(string)) {
				list.add(string);
			}
		}
		return list;
	}

}
