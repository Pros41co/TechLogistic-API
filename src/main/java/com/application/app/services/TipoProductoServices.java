package com.application.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.application.app.Dto.TipoProductoDTO;
import com.application.app.models.TipoProducto;
import com.application.app.respositories.TiposRepositorio;

@Service
public class TipoProductoServices {

    @Autowired
    TiposRepositorio tipoProductoRepositorio;

    public  List<TipoProducto> getAllTipoProductos() {
        return (List<TipoProducto>)tipoProductoRepositorio.findAll();
    }

    public TipoProducto saveTipoProducto(TipoProductoDTO request){
       TipoProducto tipoProducto = new TipoProducto();
       tipoProducto.setNombre(request.getNombre());
       return tipoProductoRepositorio.save(tipoProducto);
    }
}
