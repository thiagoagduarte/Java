package com.generation.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.clinica.model.MedicoModel;
import com.generation.clinica.repository.MedicoRepository;

@RestController
@RequestMapping("/medico")
@CrossOrigin("*")
public class MedicoController {

	@Autowired
	private MedicoRepository repositoryMedico;
	
	@GetMapping
	public ResponseEntity<List<MedicoModel>> GetAll(){
		return ResponseEntity.ok(repositoryMedico.findAll());
	}
	
	@GetMapping("/{crmMedico}")
	public ResponseEntity<MedicoModel> GetById(@PathVariable long crmMedico){
		return repositoryMedico.findById(crmMedico)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<MedicoModel> post (@RequestBody MedicoModel medico){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryMedico.save(medico));
	}
	
	@PutMapping
	public ResponseEntity<MedicoModel> put (@RequestBody MedicoModel medico){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryMedico.save(medico));
	}
	
	@DeleteMapping("/{crmMedico}")
	public void delete(@PathVariable long crmMedico) {
		repositoryMedico.deleteById(crmMedico);
	}
}
