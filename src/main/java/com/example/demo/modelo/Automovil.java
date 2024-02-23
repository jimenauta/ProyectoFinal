package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="automovil") 
public class Automovil {
	
	@Id
	@Column(name="numeroauto")
	private long id;
	
	@Column(name="cantidadpuestos", length=10, nullable=false )
	private String cantidadpuestos;

	public Automovil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Automovil(long id, String cantidadpuestos) {
		super();
		this.id = id;
		this.cantidadpuestos = cantidadpuestos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCantidadpuestos() {
		return cantidadpuestos;
	}

	public void setCantidadpuestos(String cantidadpuestos) {
		this.cantidadpuestos = cantidadpuestos;
	}

	
	
	

}
