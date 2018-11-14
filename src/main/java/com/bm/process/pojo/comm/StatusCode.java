package com.bm.process.pojo.comm;

/**
* @Package com.bm.process.pojo.comm 
* @Title: StatusCode.java   
* @Description: TODO  
* @author steven  
* @date 2018年6月1日 上午11:23:58
* @version V1.0
 */
public class StatusCode {
	/**
	 * 成功
	 */
	public static final int success = 200;
	/**
	 * 服务器端错误
	 */
	public static final int error = 500;
	/**
	* 未登录
	*/
	public static final int unlogin = 2001;

	/**
	* 未授权
	*/
	public static final int unauthorized = 401;

}
