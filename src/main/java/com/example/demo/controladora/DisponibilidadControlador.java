package com.example.demo.controladora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Disponibilidad;
import com.example.demo.repositorio.DisponibilidadRepositorio;


@RestController
@RequestMapping("/ver4/")
public class DisponibilidadControlador {
	
	@Autowired
	private DisponibilidadRepositorio repositorio;
	
	@GetMapping("/mirar4")
	public List<Disponibilidad> mirardisponibilidad(){
		return this.repositorio.findAll();
	}
	@GetMapping("/buscar4")
	public Disponibilidad buscardisponibilidad(){
	Long iddisponibilidad=123L;
		return this.repositorio.findById(iddisponibilidad).get();
	}
	@GetMapping("/guardar4")	
	public List<Disponibilidad> guardardisponibilidad(){
		Disponibilidad e1 = new Disponibilidad (1L,"1marzo2024", 10, "8:30am", "SantaMarta");
		
		Disponibilidad e2 = new Disponibilidad (2L, "2marzo2024", 5, "9:00am", "Barranqui");
		
		Disponibilidad e3 = new Disponibilidad (3L,"3marzo2024", 20, "10:00am", "Cartagena");
		
		this.repositorio.save(e1);
		this.repositorio.save(e2);
		this.repositorio.save(e3);
		return this.repositorio.findAll();
	}
	@GetMapping("/eliminar4")
	public List<Disponibilidad> eliminarfecha(){
		this.repositorio.deleteById(1L);
		return this.repositorio.findAll();

	}
	
	@GetMapping("/actualizar4") 
	public Disponibilidad actualizarfecha() {
		Disponibilidad u= this.repositorio.findById(1L).get();
		u.setFecha("29abril2024");
		this.repositorio.save(u);
		
		return this.repositorio.findById(1L).get();
	
	}

}
