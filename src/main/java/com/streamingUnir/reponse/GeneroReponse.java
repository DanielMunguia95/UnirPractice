package com.streamingUnir.reponse;

import java.util.List;

import com.streamingUnir.entity.Multimedia;

import jakarta.persistence.OneToMany;

public class GeneroReponse {

	private int idGenero;
	
	private String genero;
	
	public int getIdGenero() {
		return idGenero;
	}
	
	private List<Multimedia> multimedia;

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


}
