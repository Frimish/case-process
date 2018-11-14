package com.bm.process.dao.source1;

import java.util.List;

import com.bm.process.pojo.UserEntity;

/**
 * 
* @Package com.bm.process.dao.source1 
* @Title: UserDao.java   
* @Description: TODO  
* @author Frimish  
* @date 2018年6月7日 上午10:12:15
* @version V1.0
 */
public interface UserDao {
	
	/**
	 * 
	* @Title: loginQuery 
	* @Description: 登录
	* @param @param record
	* @param @return   
	* @return List<UserEntity>  
	* @throws
	 */
	List<UserEntity> loginQuery(UserEntity record);
	
}
