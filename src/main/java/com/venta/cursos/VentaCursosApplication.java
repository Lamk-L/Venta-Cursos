package com.venta.cursos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.venta.cursos.model.Usuario;
import com.venta.cursos.repository.UsuarioRepository;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class VentaCursosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VentaCursosApplication.class, args);
	}

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date fecha = dateFormat.parse("2024-02-07");
		Usuario usuario = new Usuario("Melvin Kevin López Asto", "kunlancelot@gmail.com", "LamkDeath13", fecha);
		usuarioRepository.save(usuario);
	}

}
