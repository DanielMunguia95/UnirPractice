package com.streamingUnir.service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.streamingUnir.entity.Multimedia;
import com.streamingUnir.reponse.MultimediaReponse;
import com.streamingUnir.repository.MultimediaRepository;

public class MultimediaService {

	@Autowired
	private MultimediaRepository multimediaRepository;

	@Autowired
	private ModelMapper mapper;

	public MultimediaReponse getMultimediaById(int id) {
		Optional<Multimedia> multimedia = multimediaRepository.findById(id);
		MultimediaReponse multimediaReponse = mapper.map(multimedia, MultimediaReponse.class);
		return multimediaReponse;
	}

	public Optional<Stream<Multimedia>> getAllMultimediasOrderByYear() {

		return Optional.ofNullable(multimediaRepository.findAll().stream()
				.sorted(Comparator.comparingInt(Multimedia::getAnio_publicacion).reversed()));
	}
	
	public Optional<List<Multimedia>> findMultimediaByGeneroIdGenero(int idgenero) {

		Optional<List<Multimedia>> multimedia = multimediaRepository.findMultimediaByGeneroIdGenero(idgenero);
		
		return multimedia;
	}
	
	public Optional<List<Multimedia>> findMultimediaByCategoriaIdCategoria(int idcategoria) {

		Optional<List<Multimedia>> multimedia = multimediaRepository.findMultimediaByCategoriaIdCategoria(idcategoria);
		
		return multimedia;
	}
	


}
