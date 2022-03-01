package com.yegecali.portafolio.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;

	
	
	public Habilidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Habilidad(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Habilidad [id=" + id + ", nombre=" + nombre + "]";
	}

}
