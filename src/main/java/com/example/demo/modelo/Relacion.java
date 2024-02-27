package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="relacion") 
public class Relacion {
	
	@Id
	@Column(name="idrelacion")
	private long id;
	
	
	//llave foranea entre la relacion de disponibilidad y la relacion de muchos(reserva) a muchos pero ojo es de muchos a uno (disponibilidad)
		@ManyToOne()
		@JoinColumn(name="iddispo", referencedColumnName = "iddisponibilidad")
		private Disponibilidad dispo;
		
	//llave foranea entre la relacion de automovil y la relacion (relacion) a uno (automovil)
		@ManyToOne()
		@JoinColumn(name="idauto", referencedColumnName = "numeroauto")
		private Automovil auto;

	public Relacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	

	public Relacion(long id, Disponibilidad dispo, Automovil auto) {
		super();
		this.id = id;
		this.dispo = dispo;
		this.auto = auto;
	}






	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}






	public Disponibilidad getDispo() {
		return dispo;
	}






	public void setDispo(Disponibilidad dispo) {
		this.dispo = dispo;
	}






	public Automovil getAuto() {
		return auto;
	}






	public void setAuto(Automovil auto) {
		this.auto = auto;
	}
	
	
	
	
	

}
