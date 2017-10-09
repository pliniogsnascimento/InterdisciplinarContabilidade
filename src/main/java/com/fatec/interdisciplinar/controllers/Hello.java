package com.fatec.interdisciplinar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fatec.interdisciplinar.model.Funcionario;
import com.fatec.interdisciplinar.service.FuncionarioService;

@Controller
public class Hello {
	
	@Autowired
	FuncionarioService funcionarioService;
	
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
	
	@RequestMapping(value = "/CadastroFuncionario")
	public String cadastroFuncionario() {
		return "cadastro-funcionario.html";
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public void getAll() {
		String message = null;
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		funcionario1.setNome("José");
		funcionario2.setNome("Plinio");
		
		this.funcionarioService.salvar(funcionario1);
		this.funcionarioService.salvar(funcionario2);
		
		//List<Funcionario> funcionarios = this.funcionarioService.finAll();
		
		//for(Funcionario funcionario:funcionarios) {
			//message = funcionario.toString() + "\n";
		//}
		
		//return message;
	}
}
