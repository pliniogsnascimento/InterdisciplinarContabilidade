package com.fatec.interdisciplinar.controllers;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fatec.interdisciplinar.model.Entrada;
import com.fatec.interdisciplinar.model.Produto;

@Controller
@RequestMapping("/Entrada")
public class EntradaController {

	public EntradaController() {
		
	}
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public String registrarEntrada() {
		// TODO implementar registro de entradas
		return "cadastro-entrada.html";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public void registrarEntrada(Produto produto) {
		// TODO implementar registro de entradas
	}

	/**
	 * 
	 */
	@RequestMapping(value = "/busca", method = RequestMethod.GET)
	public String listarEntradas() {
		// TODO implementar busca de entradas
		return "busca-entrada.html";
	}

	/**
	 * @param Entrada entrada
	 */
	@RequestMapping(value = "/busca", method = RequestMethod.POST)
	public String buscarEntrada(Entrada entrada) {
		// TODO implementar busca de entradas
		return "busca-entrada.html";
	}

}