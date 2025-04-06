package com.application.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.app.models.Cliente;
import com.application.app.respositories.ClientesRepositorio;

@Service
public class ClienteServices {
    
    @Autowired
    ClientesRepositorio clientesRepositorio;

    public Cliente saveCliente(Cliente cliente){
        return clientesRepositorio.save(cliente);
    }

    public List<Cliente> findAClientes(){
        return (List<Cliente> )clientesRepositorio.findAll();
    }

    public Optional<Cliente> getClienteById(Long id){
        return clientesRepositorio.findById(id);
    }
}
