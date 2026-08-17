package com.muniz.biblioteca_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muniz.biblioteca_api.model.Livro;
import com.muniz.biblioteca_api.model.StatusLeitura;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	List<Livro> findByStatus(StatusLeitura status);
	List<Livro> findByCategoriaId(Long categoriaId);

}
