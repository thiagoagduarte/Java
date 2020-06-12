package com.generation.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.biblioteca.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	public List<Cliente> findAllByNomeContainingIgnoreCase(String nome);
}

