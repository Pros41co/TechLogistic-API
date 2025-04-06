package com.application.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.application.app.models.Cliente;
import com.application.app.respositories.ClientesRepositorio;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	@Autowired
	private ClientesRepositorio repositorio;

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Cliente> clientes =  (List<Cliente>) repositorio.findAll();
		clientes.stream().forEach(cliente -> System.out.println(cliente));
		System.out.println("Hola");
	}

}
