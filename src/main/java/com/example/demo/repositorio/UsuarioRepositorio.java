package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

	
	// consulta dos
	@Query(value="select nombre, apellido, cedula from reserva, disponibilidad, automovil"
				+ "where reserva.iddisponibilidad = disponibilidad.iddisponibilidad and disponibilidad.numeroauto = :inAutoMovil;",
				 nativeQuery=true)
		public List<Object> usuaroauto(@Param ("inAutoMovil") String inAutoMovil);
}
