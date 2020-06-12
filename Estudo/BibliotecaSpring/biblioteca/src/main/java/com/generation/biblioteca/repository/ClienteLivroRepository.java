package com.generation.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.biblioteca.model.ClienteLivro;

@Repository
public interface ClienteLivroRepository extends JpaRepository<ClienteLivro, Long>{
	//public List<Cliente> findAllByNomeContainingIgnoreCase(String nome);
}

