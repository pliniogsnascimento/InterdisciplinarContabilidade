package com.fatec.interdisciplinar.model;


import java.util.*;



public class Relatorio {

	public Relatorio() {

	}

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