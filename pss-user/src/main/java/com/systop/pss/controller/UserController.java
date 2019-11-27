package com.systop.pss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.systop.pss.common.vo.R;
import com.systop.pss.entity.UserInfo;
import com.systop.pss.service.impl.UserInfoServiceImpl;


@RestController
public class UserController {

	@Autowired
	private UserInfoServiceImpl userInfoService;
	
	@RequestMapping("/login")
	public R login(String telPhone,String password) {
		
		UserInfo userInfo = userInfoService.selectUserBytelPhone(telPhone);
		
		System.out.println(JSON.toJSON(userInfo));	
		
	
		System.out.println("用户登录成功");
		return R.ok().data("user", JSON.toJSON(userInfo));
	}

}
