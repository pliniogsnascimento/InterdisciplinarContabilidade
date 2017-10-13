package com.fatec.interdisciplinar.service;

import java.util.List;

import com.fatec.interdisciplinar.model.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);
	List<Funcionario> findAll();
	
}
