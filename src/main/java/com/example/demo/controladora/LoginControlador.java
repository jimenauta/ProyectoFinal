package com.example.demo.controladora;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Login;
import com.example.demo.repositorio.LoginRepositorio;



@RestController
@RequestMapping("/ver3/")
public class LoginControlador {

	@Autowired
	private LoginRepositorio repositorio;
	
	@GetMapping("/crear3")	
	public List<Login> crearlogin(){
	    Login inicio = new Login (00000L,"jimenauta");
	
	    this.repositorio.save(inicio);
	    return this.repositorio.findAll();


		
		
		
	}
	
	
	
	


}

