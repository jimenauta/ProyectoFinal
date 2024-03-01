package com.example.demo.controladora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//consulta 1 de listar todas las reservas del dia 
	@GetMapping("/buscarfechareserva")
	public List<Reservas> buscafecha(){
		return this.repositorio.findByFechareserva("26febrero2024");
	}
	
	//consulta 2 listar los usuarios de un automovil
	/*@PostMapping("/buscarusuariosauto")
	public List<Object> buscarauto(@RequestParam ("automovil") String automovil){
		return this.repositorio.usuaroauto(automovil);
	}*/
	
	//consulta 3 cancelar la reserva 
	@GetMapping("/eliminarreserva")
	public List<Reservas> eliminarreservas(){
		this.repositorio.deleteById(123L);
		return this.repositorio.findAll();

	}
	//consulta 4 registrar pago de la reserva cuando el usuario llega y el administrador consulta como paga 
    @GetMapping("/registrarpaga")
    public Reservas registropago() {
    Long idReservas=123L;
    Reservas w= this.repositorio.findById(idReservas).get();
    w.setRegistropago("pagado");
    repositorio.save(w);
    return this.repositorio.findById(idReservas).get();
    
    }
    //consulta 5 realizar reservaciones a usuarios
    @GetMapping("/realizarreservacion")	
	public List<Reservas> realizarreservacion(){
		Reservas e1 = new Reservas (123L,"pendiente", "24Febrero2024");
		
		Reservas e2 = new Reservas (1234L,"pendiente", "25Febrero2024");
		
		Reservas e3 = new Reservas (12345L,"pendiente","26febrero2024");
		
		this.repositorio.save(e1);
		this.repositorio.save(e2);
		this.repositorio.save(e3);
		return this.repositorio.findAll();
	}
    //consulta 6 modificar datos de una reserva 
    @PutMapping("/modificar")
    public Reservas modificar(
			@RequestParam ("id") Long id,
			@RequestParam ("registropago") String registropago,
			@RequestParam ("fechareserva") String fechareserva) {
		
		Reservas e = repositorio.findById(id).get();
		
		

		e.setRegistropago(registropago);
		e.setFechareserva(fechareserva);
		
		repositorio.save(e);
		
		
		return repositorio.findById(id).get();
	}
    
}

