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

import com.generation.biblioteca.model.Livro;
import com.generation.biblioteca.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
@CrossOrigin("*")
public class LivroController {

	@Autowired
	private LivroRepository repositoryLivro;
	
	@GetMapping
	public ResponseEntity<List<Livro>> GetAll(){
		return ResponseEntity.ok(repositoryLivro.findAll());
	}
	
	@GetMapping("/{cdTransacao}")
	public ResponseEntity<Livro> GetById(@PathVariable long cdTransacao){
		return repositoryLivro.findById(cdTransacao)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nmLivro}")
	public ResponseEntity<List<Livro>> GetByNome(@PathVariable String nmLivro){
		return ResponseEntity.ok(repositoryLivro.findAllByNmLivroContainingIgnoreCase(nmLivro));
	}
	
	@PostMapping
	public ResponseEntity<Livro> post (@RequestBody Livro livro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryLivro.save(livro));
	}
	
	@PutMapping
	public ResponseEntity<Livro> put (@RequestBody Livro livro){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryLivro.save(livro));
	}
	
	@DeleteMapping("/{cdTransacao}")
	public void delete(@PathVariable long cdTransacao) {
		repositoryLivro.deleteById(cdTransacao);
	}
}

