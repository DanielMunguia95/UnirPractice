package com.streamingUnir.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.streamingUnir.entity.Bitacora;
import com.streamingUnir.repository.BitacoraRepository;

public class BitacoraService {

	 @Autowired
	 private BitacoraRepository bitacoraRepository;
	  
	 @Autowired
	 private ModelMapper mapper;
	 
	 public Bitacora save(Bitacora bicatora) {
	        Bitacora bitacora = bitacoraRepository.save(bicatora);
	        return bitacora;
	    }
	
}
