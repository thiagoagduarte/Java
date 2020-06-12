package com.generation.biblioteca.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbClienteLivro")
public class ClienteLivro {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cdTransacao;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cdLivro", referencedColumnName="cdLivro")	
	private Livro livro;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cdCpfCliente", referencedColumnName="cdCpfCliente")	
	private Cliente cliente;

	public long getCdTransacao() {
		return cdTransacao;
	}

	public void setCdTransacao(long cdTransacao) {
		this.cdTransacao = cdTransacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	
	

}
