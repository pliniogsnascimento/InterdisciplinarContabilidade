package com.fatec.interdisciplinar.controllers;


import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fatec.interdisciplinar.model.Saida;

@Controller
@RequestMapping("/Saida")
public class SaidaController {

	/**
	 * Default constructor
	 */
	public SaidaController() {
		
	}
	
	@RequestMapping(value = "/cadastro",method = RequestMethod.GET)
	public String registrarSaida() {
		// TODO implement here
		return "cadastro-entrada";
	}
	
	@RequestMapping(value = "/cadastro",method = RequestMethod.POST)
	public void registrarSaida(Saida saida) {
		// TODO implement here
	}
	
	@RequestMapping(value = "/busca",method = RequestMethod.GET)
	public String listarSaidas() {
		// TODO implement here
		return "busca-saida";
	}

	public void buscarSaida(Saida saida) {
		// TODO implement here
	}

}