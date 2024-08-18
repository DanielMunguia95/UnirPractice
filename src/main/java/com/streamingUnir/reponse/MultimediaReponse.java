package com.streamingUnir.reponse;

import com.streamingUnir.entity.Categoria;
import com.streamingUnir.entity.Genero;
public class MultimediaReponse {

	private int idMultimedia;
	
	private String titulo;

	private String sinopsis; 
	
	private String director;
	
	private int anio_publicacion;
	
	private String duracion;
	
	private String criticas;
	
	private String trailer;
	
    private Categoria categoria;

	private Genero genero;
	
	private String anio_subido;
	
	private String imagen;

	public int getIdMultimedia() {
		return idMultimedia;
	}

	public void setIdMultimedia(int idMultimedia) {
		this.idMultimedia = idMultimedia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnio_publicacion() {
		return anio_publicacion;
	}

	public void setAnio_publicacion(int anio_publicacion) {
		this.anio_publicacion = anio_publicacion;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getCriticas() {
		return criticas;
	}

	public void setCriticas(String criticas) {
		this.criticas = criticas;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getAnio_subido() {
		return anio_subido;
	}

	public void setAnio_subido(String anio_subido) {
		this.anio_subido = anio_subido;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
}
