package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class testController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		String str = "hahaha";
		return str;
	}
}
