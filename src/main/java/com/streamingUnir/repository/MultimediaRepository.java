package com.streamingUnir.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.streamingUnir.entity.Multimedia;

public interface MultimediaRepository extends JpaRepository<Multimedia, Integer> {
	
	public Optional<List<Multimedia>> findMultimediaByGeneroIdGenero(int idgenero);
	
	public Optional<List<Multimedia>> findMultimediaByCategoriaIdCategoria(int idcategoria);

}
