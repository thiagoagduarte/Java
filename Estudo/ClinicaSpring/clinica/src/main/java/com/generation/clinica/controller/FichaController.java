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

import com.generation.clinica.model.FichaModel;
import com.generation.clinica.repository.FichaRepository;

@RestController
@RequestMapping("/ficha")
@CrossOrigin("*")
public class FichaController {

	@Autowired
	private FichaRepository repositoryFicha;
	
	@GetMapping
	public ResponseEntity<List<FichaModel>> GetAll(){
		return ResponseEntity.ok(repositoryFicha.findAll());
	}
	
	@GetMapping("/{codFicha}")
	public ResponseEntity<FichaModel> GetById(@PathVariable Long codFicha){
		return repositoryFicha.findById(codFicha)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<FichaModel> post (@RequestBody FichaModel ficha){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryFicha.save(ficha));
	}
	
	@PutMapping
	public ResponseEntity<FichaModel> put (@RequestBody FichaModel ficha){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryFicha.save(ficha));
	}
	
	@DeleteMapping("/{codFicha}")
	public void delete(@PathVariable Long codFicha) {
		repositoryFicha.deleteById(codFicha);
	}
}
