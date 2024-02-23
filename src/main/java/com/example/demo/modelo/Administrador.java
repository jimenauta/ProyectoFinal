package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="administrador") 
public class Administrador {
	
	@Id
	@Column(name="idadministrador")
	private long id;
	
	@Column(name="nombre", length=10, nullable=false )
	private String nombre;

	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	


}
