package com.application.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.application.app.models.Cliente;
import com.application.app.services.ClienteServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping(path = "/api/clientes")
public class ClienteController {

    @Autowired
    ClienteServices clienteservicio;

    @GetMapping("/all")
    public List<Cliente> getClientes() {
        return clienteservicio.findAClientes();
    }

    @GetMapping
    public ResponseEntity<Cliente> getClienteById(@RequestParam(required = false, defaultValue = "1", name = "idCliente") Long idCliente) {
        Optional<Cliente> clienteopt = clienteservicio.getClienteById(idCliente);
        return clienteopt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    
    @PostMapping(path = "/create")
    public Cliente createClient(@RequestBody Cliente cliente) {
        return clienteservicio.saveCliente(cliente);
    }
}
