package com.bm.process.service.test;

import java.util.List;

import com.bm.process.pojo.UserEntity;

/**
 * 
* @Package com.bm.process.service.test 
* @Title: UserService.java   
* @Description: 用户相关
* @author Frimish  
* @date 2018年6月7日 上午10:08:18
* @version V1.0
 */
public interface UserService {
	
	/**
	 * 
	* @Title: loginQuery 
	* @Description: 登录
	* @param @param user
	* @param @return   
	* @return List<UserEntity>  
	* @throws
	 */
	List<UserEntity> loginQuery(UserEntity user);
	
}
