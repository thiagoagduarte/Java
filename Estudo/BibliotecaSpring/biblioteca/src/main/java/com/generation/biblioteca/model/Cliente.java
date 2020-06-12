package com.generation.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tbCliente")
public class Cliente {
	
	
	@Id
	@NotNull
	private long cdCpfCliente;
	
	@NotNull
	@Size(min= 5, max=100)
	private String nome;
	
	private int qtdEmprestimos;
	
	private int qtdDevolucoes;

	public long getCdCpfCliente() {
		return cdCpfCliente;
	}

	public void setCdCpfCliente(long cdCpfCliente) {
		this.cdCpfCliente = cdCpfCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdEmprestimos() {
		return qtdEmprestimos;
	}

	public void setQtdEmprestimos(int qtdEmprestimos) {
		this.qtdEmprestimos = qtdEmprestimos;
	}

	public int getQtdDevolucoes() {
		return qtdDevolucoes;
	}

	public void setQtdDevolucoes(int qtdDevolucoes) {
		this.qtdDevolucoes = qtdDevolucoes;
	}
	
}
