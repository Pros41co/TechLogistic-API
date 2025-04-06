package com.application.app.respositories;

import org.springframework.data.repository.CrudRepository;

import com.application.app.models.Producto;

public interface ProductosRepositorio extends CrudRepository<Producto, Long>{

}
