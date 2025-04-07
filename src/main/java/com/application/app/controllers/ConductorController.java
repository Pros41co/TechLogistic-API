package com.application.app.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.app.Dto.ConductorDTO;
import com.application.app.models.Conductor;
import com.application.app.services.ConductorServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping(path = "/api/conductores")
public class ConductorController {

    @Autowired
    ConductorServices conductorServicio;

    @GetMapping("/all")
    public List<Conductor> getAllConductores() {
        return conductorServicio.findAllConductores();
    }

    @GetMapping
    public ResponseEntity<Conductor> getConductorById(@RequestParam(name = "idConductor") Long idConductor){
        Optional<Conductor> conductor = conductorServicio.getConductorById(idConductor);
        return conductor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public Conductor createConductor(@RequestBody ConductorDTO dto){
        return conductorServicio.saveConductor(dto);
    }

    @PutMapping("/modificar")
    public ResponseEntity<Conductor> actualizarConductor(@RequestBody Map<String, String> body){
        String nombre = body.get("nombre");
        String apellido = body.get("apellido");
        String cedula = body.get("cedula");
        String telefono = body.get("telefono");
        Long id = Long.parseLong(body.get("id"));

        Conductor newConductor = conductorServicio.updateConductor(id, nombre, apellido, telefono, cedula);
        return ResponseEntity.ok(newConductor);
    }
}
