package com.application.app.respositories;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.application.app.models.Cliente;

@Repository
public class Repo_clientes_Imp implements ClientesRepositorio{

    List<Cliente> datos;

    public Repo_clientes_Imp(){
        this.datos = Arrays.asList(
            new Cliente(1L, "Alex", "Camargo", "312"),
            new Cliente(2L, "Brayan", "Camargo", "542")
        );
    }

    public List<Cliente> findAll(){
        return datos;
    }

    public Cliente getClienteById(Long id_cliente){
        return datos.stream()
            .filter(c -> c.getId_cliente().equals(id_cliente))
            .findFirst()
            .orElseThrow(); 
    }
}

