package com.generation.clinica.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tbFicha")
public class FichaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codFicha;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codPaciente", referencedColumnName="codPaciente")	
	private PacienteModel paciente;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="crmMedico", referencedColumnName="crmMedico")	
	private MedicoModel medico;
	
	@NotNull	
	private double valorConsulta;
	
	@Size(min= 1, max=200)
	private String diagnostico;
	
	@Size(min= 1, max=200)
	private String procedimento;
	
	@Size(min= 1, max=200)
	private String exame;
	
	private Date dataRetorno;

	public Long getCodFicha() {
		return codFicha;
	}

	public void setCodFicha(Long codFicha) {
		this.codFicha = codFicha;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public PacienteModel getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteModel paciente) {
		this.paciente = paciente;
	}

	public MedicoModel getMedico() {
		return medico;
	}

	public void setMedico(MedicoModel medico) {
		this.medico = medico;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getExame() {
		return exame;
	}

	public void setExame(String exame) {
		this.exame = exame;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}
	
	

}
