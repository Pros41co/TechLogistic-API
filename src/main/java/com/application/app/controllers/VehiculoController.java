package com.application.app.controllers;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.application.app.models.Vehiculo;
import com.application.app.services.VehiculoServices;

@RestController
@RequestMapping(path = "/api/vehiculos")
public class VehiculoController {


    @Autowired
    VehiculoServices vehiculoServicio;

    @GetMapping("/all")
    public List<Vehiculo> getVehiculos() {
        return vehiculoServicio.findAllVehiculos();
    }
    

    @GetMapping
    public ResponseEntity<Vehiculo> getVehiculoById(@RequestParam(name = "idVehiculo") Long idVehiculo){
        Optional<Vehiculo> vehiculoOpt = vehiculoServicio.getVehiculoById(idVehiculo);
        return vehiculoOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

        
    @PostMapping(path = "/create")
    public Vehiculo createVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoServicio.saveVehiculo(vehiculo);
    }
}
