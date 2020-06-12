package org.generation.getMoveis.controller;

import java.util.List;

import org.generation.getMoveis.model.Usuario_Compra;
import org.generation.getMoveis.repository.UsuarioCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuariocompra")
@CrossOrigin("*")
public class UsuarioCompraController {
	
	@Autowired
	private UsuarioCompraRepository repositoryUsuarioCompra;
	
	@GetMapping
	public ResponseEntity<List<Usuario_Compra>> GetAll(){
		return ResponseEntity.ok(repositoryUsuarioCompra.findAll());
	}
	
<<<<<<< HEAD
	@GetMapping("/{id}")
	public ResponseEntity<Usuario_Compra> GetById(@PathVariable long id){
		return repositoryUsuarioCompra.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Usuario_Compra> post (@RequestBody Usuario_Compra usuarioCompra){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryUsuarioCompra.save(usuarioCompra));
	}
=======
	@GetMapping("/{codigoUsuarioCompra}")
	public ResponseEntity<Usuario_Compra> GetById(@PathVariable long codigoCpf){
		return repositoryUsuarioCompra.findById(codigoCpf)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	//@GetMapping("/nome/{codigoUsuarioCompra}")
	//public ResponseEntity<List<Usuario_Compra>> GetByNome(@PathVariable String codigoUsuarioCompra){
		//return ResponseEntity.ok(repositoryUsuarioCompra.findAllByCodigoUsuarioCompraContainingIgnoreCase(codigoUsuarioCompra));
	//}
	
	//@PostMapping
	//public ResponseEntity<Usuario_Compra> post (@RequestBody Usuario_Compra usuarioCompra){
		//return ResponseEntity.status(HttpStatus.CREATED).body(repositoryUsuarioCompra.save(usuarioCompra));
	//}
>>>>>>> 9dc547098ee94d690524f66d5e5be6548a060a23
	
	//@PutMapping
	//public ResponseEntity<Usuario_Compra> put (@RequestBody Usuario_Compra usuarioCompra){
		//return ResponseEntity.status(HttpStatus.OK).body(repositoryUsuarioCompra.save(usuarioCompra));
	//}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repositoryUsuarioCompra.deleteById(id);
	}

}
