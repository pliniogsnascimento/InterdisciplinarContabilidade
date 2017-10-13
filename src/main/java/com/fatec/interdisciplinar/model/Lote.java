package com.fatec.interdisciplinar.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Lote {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLote;
	
	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	private Produto produto;

	public Lote() {
	
	}
	

	public Long getIdLote() {
		return idLote;
	}

	public void setIdLote(Long idLote) {
		this.idLote = idLote;
	}
	
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}


}