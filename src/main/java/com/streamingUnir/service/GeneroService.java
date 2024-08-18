package com.streamingUnir.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.streamingUnir.entity.Genero;
import com.streamingUnir.reponse.GeneroReponse;
import com.streamingUnir.repository.GeneroRepository;

public class GeneroService {

	 @Autowired
	 private GeneroRepository generoRepository;
	  
	 @Autowired
	 private ModelMapper mapper;
	 
	 public GeneroReponse getGeneroById(int id) {
	        Optional<Genero> genero = generoRepository.findById(id);
	        GeneroReponse generoReponse = mapper.map(genero, GeneroReponse.class);
	        return generoReponse;
	    }
	 
	 public Optional<List<Genero>> getAllGeneros() {
	      
	    return Optional.ofNullable(generoRepository.findAll());
}
}
