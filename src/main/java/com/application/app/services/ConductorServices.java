package com.application.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.app.Dto.ConductorDTO;
import com.application.app.models.Conductor;
import com.application.app.models.Vehiculo;
import com.application.app.respositories.ConductoresRepositorio;
import com.application.app.respositories.VehiculosRepositorio;

@Service
public class ConductorServices {

    @Autowired
    ConductoresRepositorio conductorRepository;

    @Autowired
    VehiculosRepositorio vehiculoRepository;

    public Conductor saveConductor(Conductor conductor){
        return conductorRepository.save(conductor);
    }

    public Conductor crearConductor(ConductorDTO request){
        Vehiculo vehiculo = vehiculoRepository.findById(request.getIdVehiculo()).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        Conductor conductor = new Conductor();
        conductor.setNombre(request.getNombre());
        conductor.setApellido(request.getApellido());
        conductor.setCedula(request.getCedula());
        conductor.setTelefono(request.getTelefono());
        conductor.setVehiculo(vehiculo);

        return conductorRepository.save(conductor);
    }

    
    public List<Conductor> findAllConductores(){
        return (List<Conductor>)conductorRepository.findAll();
    }

        public Conductor updateNombreConductor(Long id, String nuevoNombre, String nuevoApellido, String nuevoTelefono, String nuevaCedula){
        Conductor conductor = conductorRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no Encontrado"));
        conductor.setNombre(nuevoNombre);
        conductor.setApellido(nuevoApellido);
        conductor.setCedula(nuevaCedula);
        conductor.setTelefono(nuevoTelefono);
        return conductorRepository.save(conductor);
    }


}
