package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@Column(name="idusuario")
	private long id;
	
	
	@Column(name="fechanacimiento", length=15, nullable=false )
	private String fechanacimiento;
	
	@Column(name="nombres", length=15, nullable=false )
	private String nombres;
	
	@Column(name="apellidos", length=15, nullable=false )
	private String apellidos;
	
	@Column(name="cedula", length=15, nullable=false )
	private int cedula;
	
	@Column(name="telefono", length=15, nullable=false )
	private int telefono;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(long id, String fechanacimiento, String nombres, String apellidos, int cedula, int telefono) {
		super();
		this.id = id;
		this.fechanacimiento = fechanacimiento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.telefono = telefono;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
	
	

}
