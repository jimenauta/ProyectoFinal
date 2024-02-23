package com.example.demo.controladora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Login;
import com.example.demo.modelo.Reservas;
import com.example.demo.repositorio.LoginRepositorio;



@RestController
@RequestMapping("/ver3/")
public class LoginControlador {

	@Autowired
	private LoginRepositorio repositorio;
	
	@GetMapping("/crear")	
	public String crearlogin(@RequestParam String jimena, @RequestParam String jimenauta ) {
	Login login = (Login) repositorio.findAll();
	 Object password;
	if (login != null && login.get(jimenauta).equals(jimenauta)) {
         return "Login successful";
     } else {
         return "Invalid username or password";
     }
	
	


}
}
