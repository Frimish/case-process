package com.bm.process.utils;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
* @Package com.bm.process.utils 
* @Title: SpringContextUtils.java   
* @Description: TODO  
* @author steven  
* @date 2018年6月1日 上午11:24:49
* @version V1.0
 */
public class SpringContextUtils implements ApplicationContextAware {
	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	/** 
	* 取得存储在静态变量中的ApplicationContext. 
	*/
	public static ApplicationContext getApplicationContext() {
		checkApplicationContext();
		return applicationContext;
	}

	/** 
	 * 从静态变量ApplicationContext中取得Bean, 自动转型为所赋值对象的类型. 
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
		checkApplicationContext();
		return (T) applicationContext.getBean(name);
	}

	/** 
	 * 从静态变量ApplicationContext中取得Bean, 自动转型为所赋值对象的类型. 
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz) {
		checkApplicationContext();
		// 注意：这里是根据bean的class来查找所有的对象(包括子类)
		// return (T) applicationContext.getBeansOfType(clazz);
		Map map = (HashMap) applicationContext.getBeansOfType(clazz);
		for (Object v : map.values()) {
			// 返回第一个
			return (T) v;
		}
		return null;
	}

	private static void checkApplicationContext() {
		if (applicationContext == null) {
			throw new IllegalStateException("applicaitonContext未注入,请在spring-mvc.xml中定义SpringContextUtil");
		}
	}

	public static String getMessage(String key, HttpServletRequest request) {
		return applicationContext.getMessage(key, null, getLocal(request));
	}

	public static String getMessage(String key, String[] args, HttpServletRequest request) {
		return applicationContext.getMessage(key, args, getLocal(request));
	}

	public static Locale getLocal(HttpServletRequest request) {
		Locale locale = (Locale) request.getSession().getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
		if (locale == null) {
			locale = request.getLocale();
		}

		return locale;
	}
}
