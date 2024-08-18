package com.streamingUnir.entity;

import java.util.Date;


import com.fasterxml.jackson.annotation.JsonProperty;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Bitacora")
public class Bitacora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idbitacora", nullable = false, unique = true)
	@JsonProperty
	private int idBitacora;
	
	@Column(name = "idmultimedia")
	@JsonProperty
	private int idmultimedia;
		
	@OneToOne(fetch = FetchType.LAZY)
	@MapsId("idmultimedia")
	@JoinColumn(name= "idmultimedia")
	private Multimedia multimedia;

	
	@Column(name = "idtipomov")
	@JsonProperty
	private int idTipoMov;
	
	@Column(name = "iduser")
	@JsonProperty
	private int idUser;
	
	@Column(name = "username")
	@JsonProperty
	private String username;
	
	@Column(name = "fecha")
	@JsonProperty
	private Date fecha;


}
