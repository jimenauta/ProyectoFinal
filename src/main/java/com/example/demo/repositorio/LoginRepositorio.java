package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Login;

@Repository
public interface LoginRepositorio extends JpaRepository<Login, Long> {
	
	//consulta del administrador y la busqueda de esta, esta en el controlador
	@Query(value= "select id, contraseña from Login where idlogin= :inid and contraseña= :incon", nativeQuery=true)
	public List<Login> confirmacion (@Param("incon") Long incon);

	
}
