package com.fatec.interdisciplinar.model;

import javax.persistence.Entity;

@Entity
public class Lote {

	public Lote() {
	
	}

	private Long idLote;

	public Long getIdLote() {
		return idLote;
	}

	public void setIdLote(Long idLote) {
		this.idLote = idLote;
	}


}