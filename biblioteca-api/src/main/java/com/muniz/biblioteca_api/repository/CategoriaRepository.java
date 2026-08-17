package com.muniz.biblioteca_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muniz.biblioteca_api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	boolean existsByNome(String nome);

}
