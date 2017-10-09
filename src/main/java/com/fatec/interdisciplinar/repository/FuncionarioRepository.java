package com.fatec.interdisciplinar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.interdisciplinar.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
