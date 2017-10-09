package com.fatec.interdisciplinar.model;


import java.util.*;

import javax.persistence.Entity;


@Entity
public class Saida {

	
	public Saida() {
	
	}

	private Calendar dataSaida;

	public Calendar getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(Calendar dataSaida) {
		this.dataSaida = dataSaida;
	}



}