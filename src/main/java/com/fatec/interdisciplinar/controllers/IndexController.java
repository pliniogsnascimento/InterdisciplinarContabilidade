package com.fatec.interdisciplinar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fatec.interdisciplinar.model.Funcionario;
import com.fatec.interdisciplinar.service.FuncionarioServiceImplementation;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	FuncionarioServiceImplementation funcionarioService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String goToLogin() {
		System.out.println("invoked goToLogin()");
		return "index.html";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView logar(Funcionario funcionario, RedirectAttributes attributes) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/");
		
		List<Funcionario> funcionarios = funcionarioService.findAll();
		System.out.println("invoked logar\n" + funcionario.toString());
		
		for(Funcionario func:funcionarios) {
			if(func.getEmail().equals(funcionario.getEmail()) && func.getSenha().equals(funcionario.getSenha())) {
				funcionario.setIdFuncionario(func.getIdFuncionario());
				funcionario.setNome(func.getNome());
				mv.setViewName("redirect:/home");
			}
		}
		
		attributes.addFlashAttribute("mensagemErro", "Email ou senha incorretos! Por favor, tente novamente!");
		
		return mv;
	}
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "home.html";
	}
}
