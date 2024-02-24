package com.example.demo.controladora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Reservas;
import com.example.demo.repositorio.ReservasRepositorio;


@RestController
@RequestMapping("/ver2/")
public class ReservasControlador {
	
	@Autowired
	private ReservasRepositorio repositorio;
	
	@GetMapping("/mirar2")
	public List<Reservas> mirarreservas(){
		return this.repositorio.findAll();
	}
	
	@GetMapping("/buscar2")
	public Reservas buscarreserva(){
	Long idReserva=123L;
		return this.repositorio.findById(idReserva).get();
	}
	
	@GetMapping("/guardar2")	
	public List<Reservas> guardarreserva(){
		Reservas e1 = new Reservas (123L,"pendiente", "24Febrero2024");
		
		Reservas e2 = new Reservas (1234L,"pendiente", "25Febrero2024");
		
		Reservas e3 = new Reservas (12345L,"pendiente","26febrero2024");
		
		this.repositorio.save(e1);
		this.repositorio.save(e2);
		this.repositorio.save(e3);
		return this.repositorio.findAll();
	}
	
	@GetMapping("/eliminar2")
	public List<Reservas> eliminarreserva(){
		this.repositorio.deleteById(123L);
		return this.repositorio.findAll();

	}
	
	@GetMapping("/actualizar2") 
	public Reservas actualizarfecha() {
		Reservas r= this.repositorio.findById(123L).get();
		r.setFechareserva("29abril2024");
		this.repositorio.save(r);
		
		return this.repositorio.findById(123L).get();
	
	}

}
