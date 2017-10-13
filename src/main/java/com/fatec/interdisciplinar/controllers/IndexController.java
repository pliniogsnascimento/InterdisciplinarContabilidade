package com.fatec.interdisciplinar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fatec.interdisciplinar.model.Funcionario;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String goToLogin() {
		System.out.println("invoked goToLogin()");
		return "index.html";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView logar(Funcionario funcionario) {
		ModelAndView mv = new ModelAndView();
		System.out.println("invoked logar\n" + funcionario.toString());
		mv.setViewName("redirect:/home");
		return mv;
	}
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "home.html";
	}
}
