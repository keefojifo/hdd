package com.hdd.test.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hdd.test.dao.UserDAO;

@Controller

public class UserController {


	@Resource
	UserDAO udao;
	
	@GetMapping("/users")
	public String getUserList(Model m,@RequestParam Map<String,String> param) {
		m.addAttribute("users",udao.getUserList(null));
		return "user/list";
	}
}
