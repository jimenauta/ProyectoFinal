package com.example.demo.controladora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Administrador;
import com.example.demo.repositorio.AdministradorRepositorio;

  
@RestController
@RequestMapping("/ver6/")
public class AdministradorControlador {

	@Autowired 
	private AdministradorRepositorio repositorio;
	
	@GetMapping("/mirar6")
	public List<Administrador> miraraminstrador(){
		return this.repositorio.findAll();
	} 

	@GetMapping("/guardar6")	
	public List<Administrador> guardaradministrador(){
		Administrador e1 = new Administrador (38988L,"Jimena");
		
		
		this.repositorio.save(e1);
		return this.repositorio.findAll();
	}
	
	@GetMapping("/actualizar6") 
	public Administrador actualizaradministrador() {
		Administrador d= this.repositorio.findById(38988L).get();
		d.setNombre("Alejandro");
		this.repositorio.save(d);
		return this.repositorio.findById(38988L).get();
	
	}
}
