package com.generation.clinica.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MedicoDto {
	
	private Long crm;
	
	private String nome;
	
	private Long especialidade;

}
