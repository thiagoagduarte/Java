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

import com.generation.biblioteca.model.Cliente;
import com.generation.biblioteca.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {

	@Autowired
	private ClienteRepository repositoryCliente;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> GetAll(){
		return ResponseEntity.ok(repositoryCliente.findAll());
	}
	
	@GetMapping("/{cdCpfCliente}")
	public ResponseEntity<Cliente> GetById(@PathVariable long cdCpfCliente){
		return repositoryCliente.findById(cdCpfCliente)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Cliente>> GetByNome(@PathVariable String nome){
		return ResponseEntity.ok(repositoryCliente.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Cliente> post (@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryCliente.save(cliente));
	}
	
	@PutMapping
	public ResponseEntity<Cliente> put (@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryCliente.save(cliente));
	}
	
	@DeleteMapping("/{cdCpfCliente}")
	public void delete(@PathVariable long cdCpfCliente) {
		repositoryCliente.deleteById(cdCpfCliente);
	}
}
