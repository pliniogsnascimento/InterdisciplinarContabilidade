package com.fatec.interdisciplinar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fatec.interdisciplinar.model.Funcionario;
import com.fatec.interdisciplinar.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImplementation implements FuncionarioService {

	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	public void salvar(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}

	public List<Funcionario> findAll() {
		return funcionarioRepository.findAll();
	}
	

}
