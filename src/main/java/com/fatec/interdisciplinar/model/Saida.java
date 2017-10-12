package com.fatec.interdisciplinar.model;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Saida {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSaida;
	
	private Calendar dataSaida;
	
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



}