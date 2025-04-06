package com.application.app.respositories;

import org.springframework.data.repository.CrudRepository;

import com.application.app.models.Conductor;

public interface ConductoresRepositorio extends CrudRepository<Conductor, Long> {
    
}
