package com.example.demo.controladora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Relacion;
import com.example.demo.repositorio.AutomovilRepositorio;
import com.example.demo.repositorio.DisponibilidadRepositorio;
import com.example.demo.repositorio.RelacionRepositorio;
import com.example.demo.modelo.Automovil;
import com.example.demo.modelo.Disponibilidad;


@RestController
@RequestMapping("/ver7/")
public class RelacionControlador {
	
	@Autowired
	private RelacionRepositorio repositorio;
	
	@Autowired
	private AutomovilRepositorio repositorio1;
	
	@Autowired
	private DisponibilidadRepositorio repositorio2;
	
	@GetMapping("/mirar7")
	public List<Relacion> mirarrelacion(){
		return this.repositorio.findAll();
	}
	
	@GetMapping("/guardar7")	
	public List<Relacion> guardarrelacion(){
		Long n1 =1l;
		Long n2 =5555l;
		
		Disponibilidad Dispo = this.repositorio2.findById(n1).get();
		Automovil auto = this.repositorio1.findById(n2).get();
		
		Relacion e1 = new Relacion (1l,Dispo,auto);
		this.repositorio.save(e1);
		
		return this.repositorio.findAll();
	}
}
