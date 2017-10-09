package com.fatec.interdisciplinar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	@ResponseBody
	public String sayHello() {
		return "Hello World";
	}
	
}
