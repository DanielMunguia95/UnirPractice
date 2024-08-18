package com.streamingUnir.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.streamingUnir.entity.Categoria;
import com.streamingUnir.reponse.CategoriaReponse;
import com.streamingUnir.service.CategoriaService;


@RestController
public class CategoriaController {
	
	@Autowired
	 private CategoriaService categoriaService;
	 
	@GetMapping("/categorias")
	    private ResponseEntity<Optional<List<Categoria>>> getAllCategorias() {
		Optional<List<Categoria>> categoria = categoriaService.getAllCategorias();
	        return ResponseEntity.status(HttpStatus.OK).body(categoria);
	    }
	 
	  @GetMapping("/categoria/{id}")
	    private ResponseEntity<CategoriaReponse> getCategorias(@PathVariable("id") int id) {
		  CategoriaReponse categoria = categoriaService.getCategoriaById(id);
	        return ResponseEntity.status(HttpStatus.OK).body(categoria);
	    }
	  
	  
	  
	
	 
}
