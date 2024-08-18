package com.streamingUnir.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.streamingUnir.entity.Genero;
import com.streamingUnir.reponse.GeneroReponse;
import com.streamingUnir.service.GeneroService;

@RestController
public class GeneroController {
	
	@Autowired
	 private GeneroService generoService;
	 
	@GetMapping("/generos")
	    private ResponseEntity<Optional<List<Genero>>> getAllGeneros() {
		Optional<List<Genero>> genero = generoService.getAllGeneros();
	        return ResponseEntity.status(HttpStatus.OK).body(genero);
	    }
	 
	  @GetMapping("/genero/{id}")
	    private ResponseEntity<GeneroReponse> getCategorias(@PathVariable("id") int id) {
		  GeneroReponse genero = generoService.getGeneroById(id);
	        return ResponseEntity.status(HttpStatus.OK).body(genero);
	    }
}
