package com.fatec.interdisciplinar.controllers;


import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fatec.interdisciplinar.model.Funcionario;

@Controller
@RequestMapping("/Funcionario")
public class FuncionarioController {

	public FuncionarioController() {
		
	}
	
	@RequestMapping(value = "/cadastro",method = RequestMethod.POST)
	public String cadastrarFuncionario() {
		// TODO implement here
		return "cadastro-funcionario";
	}
	
	public void cadastrarFuncionario(Funcionario funcionario) {
		// TODO implement here
	}

	public void alterarFuncionario(Funcionario funcionario) {
		// TODO implement here
	}

	public void excluirFuncionario(Long id) {
		// TODO implement here
	}
	
	@RequestMapping(value="/busca",method = RequestMethod.GET)
	public String listarFuncionarios() {
		// TODO implement here
		return "busca-funcionario";
	}

}