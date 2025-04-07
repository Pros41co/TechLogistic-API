package com.application.app.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.app.Dto.RutaDTO;
import com.application.app.models.Ruta;
import com.application.app.services.RutaServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api/rutas")
public class RutaController {

    @Autowired
    RutaServices rutaServicio;

    @GetMapping("/all")
    public List<Ruta> getAllRutas(){
        return rutaServicio.findAllRutas();
    }

    @PostMapping("/create")
    public Ruta createRuta(@RequestBody RutaDTO dto) {
        return rutaServicio.saveRuta(dto);
    }
    

}
    

