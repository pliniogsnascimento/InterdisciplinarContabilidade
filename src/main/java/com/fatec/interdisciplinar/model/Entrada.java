package com.fatec.interdisciplinar.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Entrada {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idEntrada;
	private Calendar dataEntrada;
	
	public Entrada() {
		
	}
	

	public Calendar getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public Long getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(Long idEntrada) {
		this.idEntrada = idEntrada;
	}


}