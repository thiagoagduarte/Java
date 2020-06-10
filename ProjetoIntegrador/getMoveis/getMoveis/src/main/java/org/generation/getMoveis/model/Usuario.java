package org.generation.getMoveis.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name= "TB_USUARIO")
public class Usuario {
	
	@Id
	private long cd_cpf;
	

	@NotNull
	@Size(min =5, max = 100)
	private String nome_cliente;

	private Date dt_nascimento;
	
	@NotNull
	@Size(min =5, max = 100)
	private String email;
	
	@NotNull
	@Size(min =5, max = 100)
	private String senha;

}

