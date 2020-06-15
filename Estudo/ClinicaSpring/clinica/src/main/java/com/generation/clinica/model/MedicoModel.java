package com.generation.clinica.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tbMedico")
public class MedicoModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long crmMedico;
	
	@NotNull
	@Size(min= 2, max=100)
	private String nome;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codEspecialidade", referencedColumnName="codEspecialidade")	
	private EspecialidadeModel especialidade;

	
	public long getCrmMedico() {
		return crmMedico;
	}

	public void setCrmMedico(long crmMedico) {
		this.crmMedico = crmMedico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EspecialidadeModel getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(EspecialidadeModel especialidade) {
		this.especialidade = especialidade;
	}
	
	
		
}
