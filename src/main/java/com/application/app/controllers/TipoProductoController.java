package com.application.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.application.app.Dto.TipoProductoDTO;
import com.application.app.models.TipoProducto;
import com.application.app.services.TipoProductoServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api/tipos")
public class TipoProductoController {

    @Autowired
    TipoProductoServices tipoProductoServicio;

    @GetMapping("/all")
    public List<TipoProducto> getAllTipoProductos(){
        return tipoProductoServicio.getAllTipoProductos();
    }

    @PostMapping(path = "/create")
    public TipoProducto createTipoProducto(@RequestBody TipoProductoDTO dto){
        return tipoProductoServicio.saveTipoProducto(dto);
    }
}
