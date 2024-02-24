package com.example.demo.controladora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Automovil;
import com.example.demo.repositorio.AutomovilRepositorio;


@RestController
@RequestMapping("/ver5/")
public class AutomovilControlador {
	
	@Autowired
	private AutomovilRepositorio repositorio;
	
	@GetMapping("/mirar5")
	public List<Automovil> mirarautomovil(){
		return this.repositorio.findAll();
	}
	
	@GetMapping("/guardar5")	
	public List<Automovil> guardarautomovil(){
		Automovil e1 = new Automovil (5555L,15);
		
		Automovil e2 = new Automovil (4444L,15);
		
		Automovil e3 = new Automovil (6666L,15);
		
		this.repositorio.save(e1);
		this.repositorio.save(e2);
		this.repositorio.save(e3);
		return this.repositorio.findAll();
	}

}
