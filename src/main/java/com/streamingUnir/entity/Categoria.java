package com.streamingUnir.entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Categoria")
public class Categoria {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "idcategoria", nullable = false, unique = true)
	 private int idCategoria;
	
	 @Column(name = "categoria")
	 private String categoria;
	  
	 @OneToMany(mappedBy = "categoria")
	 private Set<Multimedia> multimedia;
		 

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
