package com.fatec.interdisciplinar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lote {

	public Lote() {
	
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLote;

	public Long getIdLote() {
		return idLote;
	}

	public void setIdLote(Long idLote) {
		this.idLote = idLote;
	}


}