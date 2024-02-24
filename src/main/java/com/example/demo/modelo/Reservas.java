package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reservas")
public class Reservas {

	@Id
	@Column(name="idreservas")
	private long id;
	
	@Column(name="registropago", length=10, nullable=false )
	private String registropago;
	
	@Column(name="fechareserva", length=10, nullable=false )
	private String fechareserva;

	public Reservas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservas(long id, String registropago, String fechareserva) {
		super();
		this.id = id;
		this.registropago = registropago;
		this.fechareserva = fechareserva;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegistropago() {
		return registropago;
	}

	public void setRegistropago(String registropago) {
		this.registropago = registropago;
	}

	public String getFechareserva() {
		return fechareserva;
	}

	public void setFechareserva(String fechareserva) {
		this.fechareserva = fechareserva;
	}
	
	
	
	
	
	
}
