package com.fatec.interdisciplinar.model;


import java.util.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Relatorio {

	public Relatorio() {

	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRelatorio;
	
	private Calendar dataGeracao;

	public Calendar getDataGeracao() {
		return dataGeracao;
	}

	public void setDataGeracao(Calendar dataGeracao) {
		this.dataGeracao = dataGeracao;
	}

	public Long getIdRelatorio() {
		return idRelatorio;
	}

	public void setIdRelatorio(Long idRelatorio) {
		this.idRelatorio = idRelatorio;
	}

}