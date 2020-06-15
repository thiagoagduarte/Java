package com.generation.clinica.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tbPaciente")
public class PacienteModel {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long codPaciente;
	
	@NotNull
	@Size(min= 2, max=100)
	private String nome;
	
	@NotNull
	@Size(min= 2, max=100)
	private String endereco;
	
	@NotNull
	private int cep;
	
	@NotNull
	private int telefone;

	public long getCodPaciente() {
		return codPaciente;
	}

	public void setCodPaciente(long codPaciente) {
		this.codPaciente = codPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
}
