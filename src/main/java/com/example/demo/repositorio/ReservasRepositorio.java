package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Reservas;

@Repository
public interface ReservasRepositorio extends JpaRepository<Reservas, Long> {
	
	public List<Reservas> findByFechareserva(String fechareserva);

	
	
	/*@Query(value="select nombre, apellido, cedula from reserva, disponibilidad, automovil"
			+ "where reserva.iddisponibilidad = disponibilidad.iddisponibilidad and disponibilidad.numeroauto = :inAutoMovil;",
			 nativeQuery=true)
	public List<Object> usuaroauto(@Param ("inAutoMovil") String inAutoMovil);*/
}
