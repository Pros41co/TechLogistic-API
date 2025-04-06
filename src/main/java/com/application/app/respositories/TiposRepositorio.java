package com.application.app.respositories;

import org.springframework.data.repository.CrudRepository;

import com.application.app.models.TipoProducto;

public interface TiposRepositorio extends CrudRepository<TipoProducto, Long> {
    
}
