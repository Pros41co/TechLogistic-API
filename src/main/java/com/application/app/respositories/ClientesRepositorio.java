package com.application.app.respositories;


import org.springframework.data.repository.CrudRepository;

import com.application.app.models.Cliente;

public interface ClientesRepositorio extends CrudRepository<Cliente, Long>{
}
