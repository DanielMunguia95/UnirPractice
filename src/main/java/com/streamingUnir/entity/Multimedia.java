package com.streamingUnir.entity;


import java.util.Set;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "Multimedia")
public class Multimedia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idmultimedia", nullable = false, unique = true)
	private int idMultimedia;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "sinopsis")
	private String sinopsis; 
	
	@Column(name = "director")
	private String director;
	
	@Column(name = "anio_publicacion")
	private int anio_publicacion;
	
	@Column(name = "duracion")
	private String duracion;
	
	@Column(name = "criticas")
	private String criticas;
	
	@Column(name = "trailer")
	private String trailer;
	
	@ManyToOne
    @JoinColumn(name = "idcategoria")
    private Categoria categoria;

	@ManyToOne
    @JoinColumn(name = "idgenero")
	private Genero genero;
	
	@Column(name = "anio_subido")
	private String anio_subido;
	
	@Column(name = "imagen")
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
