package com.streamingUnir.service;

import java.util.List;
import java.util.Optional;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.streamingUnir.entity.Categoria;
import com.streamingUnir.reponse.CategoriaReponse;
import com.streamingUnir.repository.CategoriaRepository;


public class CategoriaService {
	
	 @Autowired
	 private CategoriaRepository categoriaRepoitory;
	  
	 @Autowired
	    private ModelMapper mapper;
	 
	 public CategoriaReponse getCategoriaById(int id) {
	        Optional<Categoria> categoria = categoriaRepoitory.findById(id);
	        CategoriaReponse categoriaReponse = mapper.map(categoria, CategoriaReponse.class);
	        return categoriaReponse;
	    }
	 
	 public Optional<List<Categoria>> getAllCategorias() {
	      
	    return Optional.ofNullable(categoriaRepoitory.findAll());
}

}