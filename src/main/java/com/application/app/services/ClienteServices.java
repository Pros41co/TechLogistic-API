package com.application.app.services;

import java.util.List;

import com.application.app.models.Cliente;

public interface ClienteServices {
    List<Cliente> findAll();
    Cliente getClienteById(Long id_cliente);
}
