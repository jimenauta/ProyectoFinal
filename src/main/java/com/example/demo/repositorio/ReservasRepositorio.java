package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.modelo.Reservas;

@Repository
public interface ReservasRepositorio extends JpaRepository<Reservas, Long> {

	
}
