package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login") 
public class Login {
	
	@Id
	@Column(name="idlogin")
	private Long id;
	
	@Column(name="contraseña", length=10, nullable=false )
	private String contraseña;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(long id, String contraseña) {
		super();
		this.id = id;
		this.contraseña = contraseña;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	

}
