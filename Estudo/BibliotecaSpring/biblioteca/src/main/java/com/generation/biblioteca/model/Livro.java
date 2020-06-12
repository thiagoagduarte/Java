package com.generation.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tbLivro")
public class Livro {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cdLivro;
	
	@NotNull
	@Size(min= 5, max=100)
	private String nmLivro;
	
	@NotNull
	@Size(min= 2, max=100)
	private String tipoGenero;

	public long getCdLivro() {
		return cdLivro;
	}

	public void setCdLivro(long cdLivro) {
		this.cdLivro = cdLivro;
	}

	public String getNmLivro() {
		return nmLivro;
	}

	public void setNmLivro(String nmLivro) {
		this.nmLivro = nmLivro;
	}

	public String getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(String tipoGenero) {
		this.tipoGenero = tipoGenero;
	}	
	
	

}

