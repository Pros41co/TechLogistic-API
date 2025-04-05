package com.application.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.application.app.models.Cliente;
import com.application.app.services.ClienteServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping(path = "/api")
public class ClienteController {

    private ClienteServices servicio = new ClienteServices();

    @GetMapping("/clientes")
    public List<Cliente> listaClientes(){
        return servicio.findAll();
    }

    @GetMapping("/{IdCliente}")
    public Cliente mostrarCliente(@PathVariable Long IdCliente){
        return servicio.getClienteById(IdCliente);
    }
}
