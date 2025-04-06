package com.application.app.respositories;

import java.util.List;

import com.application.app.models.Cliente;

public interface ClientesRepositorio {
    List<Cliente> findAll();
    Cliente getClienteById(Long id_cliente);
}
