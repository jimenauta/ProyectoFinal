package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="disponibilidad")
public class Disponibilidad {
	
	@Id
	@Column(name="iddisponibilidad")
	private long id;
	
	@Column(name="fecha", length=10, nullable=false )
	private String fecha;
	
	@Column(name="cantidadpuestos", length=10, nullable=false )
	private int cantidadpuestos;
	
	@Column(name="horasalida", length=10, nullable=false )
	private String horasalida;

	public Disponibilidad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Disponibilidad(long id, String fecha, int cantidadpuestos, String horasalida) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.cantidadpuestos = cantidadpuestos;
		this.horasalida = horasalida;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getCantidadpuestos() {
		return cantidadpuestos;
	}

	public void setCantidadpuestos(int cantidadpuestos) {
		this.cantidadpuestos = cantidadpuestos;
	}

	public String getHorasalida() {
		return horasalida;
	}

	public void setHorasalida(String horasalida) {
		this.horasalida = horasalida;
	}
	
	
	

}
