package com.fatec.interdisciplinar.model;


import java.util.*;

import javax.persistence.Entity;


@Entity
public class Entrada {

	public Entrada() {
		
	}

	private Calendar dataEntrada;

	public Calendar getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	

}