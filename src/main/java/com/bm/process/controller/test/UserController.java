package com.bm.process.controller.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bm.process.pojo.UserEntity;
import com.bm.process.pojo.comm.CommonResultT;
import com.bm.process.service.test.UserService;
import com.bm.process.utils.StrUtils;

import io.swagger.annotations.ApiOperation;

/**
 * 
 * @Package com.bm.process.controller.test
 * @Title: UserController.java
 * @Description: 用户相关
 * @author Frimish
 * @date 2018年6月7日 下午3:13:51
 * @version V1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 
	* @Title: login 
	* @Description: TODO
	* @param request
	* @param response
	* @param user
	* @param session
	* @return   
	* @return CommonResult  
	* @throws
	 */
	@ApiOperation(value = "登录", notes = "登录接口")
	@PostMapping("/login")
	public CommonResultT<Integer> login(HttpServletRequest request, HttpServletResponse response, UserEntity user,
			HttpSession session) {

		/** 记住密码操作 */
		String chbstr[] = request.getParameterValues("remember");
		String remember = "";
		if (chbstr != null) {
			remember = chbstr[0];
		}
		// 创建Cookie
		Cookie loginNameCookie;
		try {
			loginNameCookie = new Cookie("loginNameCookie", URLEncoder.encode(user.getName(), "utf-8"));
			Cookie pswCookie = new Cookie("pswCookie", user.getPwd());
			Cookie corpCookie = new Cookie("corpCookie", URLEncoder.encode(user.getCorpName(), "utf-8"));
			Cookie corpidCookie = new Cookie("corpidCookie", user.getCorpId());
			Cookie corplevelCookie = new Cookie("corplevelCookie", user.getOrgLevCode());

			// 设置Cookie的父路径
			loginNameCookie.setPath(request.getContextPath() + "/");
			pswCookie.setPath(request.getContextPath() + "/");
			corpCookie.setPath(request.getContextPath() + "/");
			corpidCookie.setPath(request.getContextPath() + "/");
			corplevelCookie.setPath(request.getContextPath() + "/");

			// 获取是否保存Cookie
			if (StrUtils.isNullOrEmpty(remember)) {// 不保存Cookie
				loginNameCookie.setMaxAge(0);
				pswCookie.setMaxAge(0);
				corpCookie.setMaxAge(0);
				corpidCookie.setMaxAge(0);
				corplevelCookie.setMaxAge(0);
			} else {// 保存Cookie的时间长度，单位为秒
				loginNameCookie.setMaxAge(7 * 24 * 60 * 60);
				pswCookie.setMaxAge(7 * 24 * 60 * 60);
				corpCookie.setMaxAge(7 * 24 * 60 * 60);
				corpidCookie.setMaxAge(7 * 24 * 60 * 60);
				corplevelCookie.setMaxAge(7 * 24 * 60 * 60);
			}
			// 加入Cookie到响应头
			response.addCookie(loginNameCookie);
			response.addCookie(pswCookie);
			response.addCookie(corpCookie);
			response.addCookie(corpidCookie);
			response.addCookie(corplevelCookie);
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}

		// 用户查询
		List<UserEntity> users = userService.loginQuery(user);
		
		int count = 0;
		
		// session存放
		if (users != null && users.size() > 0) {
			count = users.size();
			session.setAttribute("User", users.get(0));
		}

		return CommonResultT.ok(count);

	}
}
