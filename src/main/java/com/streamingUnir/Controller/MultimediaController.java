package com.streamingUnir.Controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.streamingUnir.entity.Multimedia;
import com.streamingUnir.reponse.GeneroReponse;
import com.streamingUnir.reponse.MultimediaReponse;
import com.streamingUnir.service.MultimediaService;

@RestController
@CrossOrigin(origins = {}, allowedHeaders = {})
public class MultimediaController {
	
	@Autowired
	 private MultimediaService multimediaService;

	/*Obtener todas las multimedias ordenadas por anio*/
	@GetMapping("/multimedias")
    private ResponseEntity<Optional<Stream<Multimedia>>> getAllMultimediasOrderByYear() {
	Optional<Stream<Multimedia>> multimedia = multimediaService.getAllMultimediasOrderByYear();
        return ResponseEntity.status(HttpStatus.OK).body(multimedia);
    }
	
	/*Obtener las multimedias por idMultimedia*/
	@GetMapping("/multimedia/{id}")
	    private ResponseEntity<MultimediaReponse> getCategorias(@PathVariable("id") int id) {
		MultimediaReponse multimedia = multimediaService.getMultimediaById(id);
	        return ResponseEntity.status(HttpStatus.OK).body(multimedia);
	    }
	
	/*Obtener las multimedias por Genero*/
	@GetMapping("/multimedia/genero/{id}")
    private ResponseEntity<Optional<List<Multimedia>>> getMultimediasByGenero(@PathVariable("id") int id) {
	Optional<List<Multimedia>> multimedia = multimediaService.findMultimediaByGeneroIdGenero(id);
        return ResponseEntity.status(HttpStatus.OK).body(multimedia);
    }
	

	/*Obtener las multimedias por Categoria*/
	@GetMapping("/multimedia/categoria/{id}")
    private ResponseEntity<Optional<List<Multimedia>>> getMultimediasByCategoria(@PathVariable("id") int id) {
	Optional<List<Multimedia>> multimedia = multimediaService.findMultimediaByCategoriaIdCategoria(id);
        return ResponseEntity.status(HttpStatus.OK).body(multimedia);
    }
	
	
}
