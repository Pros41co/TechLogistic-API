package com.application.app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.application.app.Dto.EntregaDTO;
import com.application.app.enums.EstadoEntregaEnum;
import com.application.app.models.Entrega;
import com.application.app.services.EntregaServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/entregas")
public class EntregaController {

    @Autowired
    EntregaServices entregaServicio;

    @GetMapping("/all")
    public List<Entrega> getAllEntregas(){
        return entregaServicio.findAllEntregas();
    }

    @PostMapping("/create")
    public Entrega createEntrega(@RequestBody EntregaDTO dto){
        return entregaServicio.saveEntrega(dto);
    }

    @PutMapping("/modificar")
    public Entrega updateEstadoEntrega(@RequestBody Map<String, String> body){
        Long id = Long.parseLong(body.get("id"));
        EstadoEntregaEnum estadonuevo = EstadoEntregaEnum.valueOf(body.get("estado"));
        return entregaServicio.updateEstadoEntrega(id, estadonuevo);
    }
}

