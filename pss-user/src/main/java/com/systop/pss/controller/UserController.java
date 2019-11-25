package com.systop.pss.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.systop.pss.common.vo.R;


@RestController
public class UserController {

	@RequestMapping("/login")
	public R login(String userName,String password) {
		
		if (!userName.equals("admin") || !password.equals("admin")) {
			System.out.println("用户登录失败，账号或者密码错误");
			return R.error().message("用户登录失败，账号或者密码错误");
		}
		System.out.println("用户登录成功");
		return R.ok().data("userName", userName);
	}

}
