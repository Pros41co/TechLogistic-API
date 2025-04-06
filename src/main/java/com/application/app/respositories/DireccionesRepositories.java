package com.application.app.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.application.app.models.Direcciones;

public interface DireccionesRepositories extends CrudRepository<Direcciones, Long>{
    List<Direcciones> findByCliente_IdCliente(Long idCliente);

}