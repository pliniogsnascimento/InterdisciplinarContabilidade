package com.fatec.interdisciplinar.controllers;


import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fatec.interdisciplinar.model.Produto;

@Controller
@RequestMapping("/Produto")
public class EstoqueController {

	public EstoqueController() {
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String listarProdutos() {
		return "busca-produto.html";
	}
	
	@RequestMapping(value = "/nome/{nome}")
	public String buscarProduto(@PathVariable String nome) {
		// TODO implement here
		return "busca-produto.html";
	}

}