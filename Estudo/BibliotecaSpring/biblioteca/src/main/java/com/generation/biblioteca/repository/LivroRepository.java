package com.generation.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.biblioteca.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
	public List<Livro> findAllByNmLivroContainingIgnoreCase(String nmLivro);
}

