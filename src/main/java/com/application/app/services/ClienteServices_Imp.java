package com.application.app.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.application.app.models.Cliente;
import com.application.app.respositories.ClientesRepositorio;

@Component
public class ClienteServices_Imp implements ClienteServices{

    @Autowired
    private ClientesRepositorio repositorio;

    public List<Cliente> findAll(){
        return repositorio.findAll().stream().map(
            cliente -> {
                String nombre_final = cliente.getPrimer_nombre().toUpperCase();
                Cliente modified_client = new Cliente(cliente.getId_cliente(), nombre_final, cliente.getPrimer_apellido(), cliente.getCedula());
                return modified_client;
            }
        ).collect(Collectors.toList());
    }

    public Cliente getClienteById(Long id_cliente){
        return repositorio.getClienteById(id_cliente);
    }
}
