package com.application.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.app.Dto.DireccionesDTO;
import com.application.app.models.Direcciones;
import com.application.app.services.DireccionesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;


@RestController
@RequestMapping("/api/direcciones")
public class DireccionesController {

    @Autowired
    DireccionesServices direccionServicio;

    @GetMapping
    public List<Direcciones> getDireccionesById(@RequestParam(name = "idCliente") Long idCliente) {
        List<Direcciones> direcciones = direccionServicio.getDireccionPorClienteId(idCliente);
        return direcciones;
    }

    @PostMapping("/create")
    public Direcciones createDireccion(@RequestBody DireccionesDTO request) {
        return  direccionServicio.crearDireccion(request);
    }
    
}
