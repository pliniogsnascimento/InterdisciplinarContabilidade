package com.fatec.interdisciplinar.model;

import javax.persistence.Entity;


@Entity
public class Gerente extends Funcionario {
	
	public Gerente() {

	}

	private Long idGerente;

	public Long getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(Long idGerente) {
		this.idGerente = idGerente;
	}
	
}