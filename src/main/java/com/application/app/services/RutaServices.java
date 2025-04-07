package com.application.app.services;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.app.Dto.RutaDTO;
import com.application.app.models.Conductor;
import com.application.app.models.Ruta;
import com.application.app.respositories.ConductoresRepositorio;
import com.application.app.respositories.RutasRepositorio;

@Service
public class RutaServices {

    @Autowired
    RutasRepositorio rutaRepository;

    @Autowired
    ConductoresRepositorio conductorRepository;

    public List<Ruta> findAllRutas(){
        return (List<Ruta>)rutaRepository.findAll();
    }

    public Ruta saveRuta(RutaDTO dto){
        Conductor conductor = conductorRepository.findById(dto.getIdConductor()).orElseThrow(() -> new RuntimeException("Conductor no encontrado"));
        Ruta ruta = new Ruta();
        ruta.setConductor(conductor);
        ruta.setDestino(dto.getDestino());
        ruta.setEstado(dto.getEstado());
        ruta.setOrigen(dto.getOrigen());
        ruta.setFechaRuta(dto.getFechaRuta());
        ruta.setFechaEstado(LocalDateTime.now());
        return rutaRepository.save(ruta);
    }

}
