package com.example.demo.controladora;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modelo.Usuario;
import com.example.demo.repositorio.UsuarioRepositorio;



@RestController
@RequestMapping("/ver1/")
public class UsuarioControlador {
	
	@Autowired
	private UsuarioRepositorio repositorio;
	
	@GetMapping("/mirar")
	public List<Usuario> mirarusuario(){
		return this.repositorio.findAll();
	}
	
	@GetMapping("/buscar")
	public Usuario buscarusuario(){
	Long idusuario=123L;
		return this.repositorio.findById(idusuario).get();
				}
	
	@GetMapping("/guardar")	
	public List<Usuario> guardarusuario(){
		Usuario e1 = new Usuario (123L,"28abril2005", "Jimena","Garzon" , 1054542789, 658392);
		
		Usuario e2 = new Usuario (1234L,"10diciembre2004", "Daniel","Correa",1054541576,674822);
		
		Usuario e3 = new Usuario (12345L,"18julio1987","Berenice","Guzman", 24714474,692917);
		this.repositorio.save(e1);
		this.repositorio.save(e2);
		this.repositorio.save(e3);
		return this.repositorio.findAll();
	}
	
	@GetMapping("/eliminar")
	public List<Usuario> eliminarusuario(){
		this.repositorio.deleteById(12345L);
		return this.repositorio.findAll();

	}
	
	@GetMapping("/actualizar") 
	public Usuario actualizartelefono() {
		Usuario a= this.repositorio.findById(12345L).get();
		a.setTelefono(780875);
		this.repositorio.save(a);
		
		return this.repositorio.findById(12345L).get();
	
	}
		
}
