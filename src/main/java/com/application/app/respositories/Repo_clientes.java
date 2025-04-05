package com.application.app.respositories;

import java.util.Arrays;
import java.util.List;

import com.application.app.models.Cliente;

public class Repo_clientes {

    List<Cliente> datos;

    public Repo_clientes(){
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

