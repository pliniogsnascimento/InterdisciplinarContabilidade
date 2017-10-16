package com.fatec.interdisciplinar.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Saida {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSaida;
	@Enumerated
	private MetodoSaida metodoSaida;
	@Temporal(TemporalType.DATE)
	private Calendar dataSaida;
	private int quantidade;
	@ManyToOne
	private Funcionario funcionario;
	@OneToOne
	private Produto produto;
	
	public Saida() {
	
	}

	public Long getIdSaida() {
		return idSaida;
	}

	public void setIdSaida(Long idSaida) {
		this.idSaida = idSaida;
	}

	public Calendar getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Calendar dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
	public MetodoSaida getMetodoSaida() {
		return metodoSaida;
	}

	public void setMetodoSaida(MetodoSaida metodoSaida) {
		this.metodoSaida = metodoSaida;
	}
	
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



}