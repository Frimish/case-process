package com.bm.process.service.impl.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bm.process.dao.source1.UserDao;
import com.bm.process.pojo.UserEntity;
import com.bm.process.service.test.UserService;
import com.bm.process.utils.MD5Util;

/**
 * 
* @Package com.bm.process.service.impl.test 
* @Title: UserServiceImpl.java   
* @Description:  用户相关
* @author Frimish  
* @date 2018年6月7日 上午10:07:25
* @version V1.0
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	/**
	 * 
	 * Description: 登录
	 * @param user
	 * @return
	 */
	@Override
	public List<UserEntity> loginQuery(UserEntity user) {
		user.setPwd(MD5Util.md5of32(user.getPwd()));
		return userDao.loginQuery(user);
	}

}
