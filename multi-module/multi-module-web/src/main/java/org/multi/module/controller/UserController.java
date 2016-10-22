/*
 * File Name: LifeService.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年5月23日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月23日
 * Bugzilla Id: 
 * Modify Content: 
 */
package org.multi.module.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.multi.module.common.model.User;
import org.multi.module.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;





import com.google.gson.Gson;

/**
 * 
 * @author    Pi Chen
 * @version   webbf V1.0.0, 2016年5月23日
 * @see       
 * @since     webbf V1.0.0
 */
@Controller
@RequestMapping(value="/user")
public class UserController extends BaseController {
	@Autowired
	private IUserService userService;
	 
	@RequestMapping(value="/getUserList" ,produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getUserList(int pageNo, int pageSize){
		Gson gson = new Gson();
		Map<String, Object> map = new HashMap<String, Object>();
		try{
			Map<String, Object> param = new HashMap<String, Object>();
			
			param.put("pageNo", pageNo);
			param.put("pageSize", pageSize);
			List<User> userList = userService.queryAll(param);
			map.put("userList",userList);
			return gson.toJson(map);
		}catch(Exception e){
			logger.error(e.toString(), e);
		}
		return gson.toJson("faild");
	}
	
	@RequestMapping(value="/deleteUser" ,produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getUserList(int userId){
		Gson gson = new Gson();
		try{
			Map<String, Object> param = new HashMap<String, Object>();
			
			param.put("userId", userId);
			userService.deleteUser(param);
			return gson.toJson("success");
		}catch(Exception e){
			logger.error(e.toString(), e);
		}
		return gson.toJson("faild");
	}
	
	@RequestMapping(value="/saveUserTest" ,produces = "application/json; charset=utf-8")
	@ResponseBody
	public String saveUserTest(String userName, String address){
		Gson gson = new Gson();
		/* test transaction */
		try{
			Map<String, Object> param = new HashMap<String, Object>();
			
			param.put("name", userName);
			param.put("address", address);
			userService.saveUser(param);

		}catch(Exception e){
			logger.error(e.toString(), e);
			return gson.toJson("fail");
		}
		return gson.toJson("success");
	}
}
