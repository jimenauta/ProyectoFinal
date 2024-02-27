package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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

	//llave foranea entre la relacion de administrador y la reserva de muchos(reserva) a uno (administrador)
	@ManyToOne()
	@JoinColumn(name="id", referencedColumnName = "idadministrador")
	private Administrador admin;
	
	//llave foranea entre la relacion de usuario y la reserva de muchos(reserva) a uno (usuario)
	@ManyToOne()
	@JoinColumn(name="idusu", referencedColumnName = "idusuario")
	private Usuario usuari;
	
	
	//llave foranea entre la relacion de disponibilidad y la reserva de uno(reserva) a uno (disponibilidad)
	@OneToOne()
	@JoinColumn(name="iddispo", referencedColumnName = "iddisponibilidad")
	private Disponibilidad dispo;
	
	
	
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
