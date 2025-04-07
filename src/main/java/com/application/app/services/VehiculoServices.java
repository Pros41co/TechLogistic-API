package com.application.app.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.app.models.Vehiculo;
import com.application.app.respositories.VehiculosRepositorio;

@Service
public class VehiculoServices {

    @Autowired
    VehiculosRepositorio vehiculoRepositorio;

    public Vehiculo saveVehiculo(Vehiculo vehiculo){
        return vehiculoRepositorio.save(vehiculo);
    }


    public List<Vehiculo> findAllVehiculos(){
        return (List<Vehiculo> )vehiculoRepositorio.findAll();
    }

    public  Optional<Vehiculo> getVehiculoById(Long id){
        Optional<Vehiculo> vehiculoOpt = vehiculoRepositorio.findById(id);
        return vehiculoOpt;
    }

}
