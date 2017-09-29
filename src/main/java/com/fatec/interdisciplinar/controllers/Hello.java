package com.fatec.interdisciplinar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
	
	@RequestMapping(value="/")
	public String hello() {
		return "hello.html";
	}
	
	@RequestMapping(value="/index")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping(value="/home")
	public String home() {
		return "home.html";
	}
}
