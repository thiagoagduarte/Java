package com.generation.biblioteca.controller;

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

import com.generation.biblioteca.model.ClienteLivro;
import com.generation.biblioteca.repository.ClienteLivroRepository;

@RestController
@RequestMapping("/transacao")
@CrossOrigin("*")
public class ClienteLivroController {

	@Autowired
	private ClienteLivroRepository repositoryClienteLivro;
	
	@GetMapping
	public ResponseEntity<List<ClienteLivro>> GetAll(){
		return ResponseEntity.ok(repositoryClienteLivro.findAll());
	}
	
	@GetMapping("/{cdTransacao}")
	public ResponseEntity<ClienteLivro> GetById(@PathVariable long cdTransacao){
		return repositoryClienteLivro.findById(cdTransacao)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<ClienteLivro> post (@RequestBody ClienteLivro clientelivro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryClienteLivro.save(clientelivro));
	}
	
	@PutMapping
	public ResponseEntity<ClienteLivro> put (@RequestBody ClienteLivro clientelivro){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryClienteLivro.save(clientelivro));
	}
	
	@DeleteMapping("/{cdTransacao}")
	public void delete(@PathVariable long cdTransacao) {
		repositoryClienteLivro.deleteById(cdTransacao);
	}
}

