package com.application.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.application.app.Dto.ProductoDTO;
import com.application.app.models.Producto;
import com.application.app.models.TipoProducto;
import com.application.app.respositories.ProductosRepositorio;
import com.application.app.respositories.TiposRepositorio;

@Service
public class ProductoServices {

    @Autowired
    ProductosRepositorio productoRepository;

    @Autowired
    TiposRepositorio tipoRepository;

    public Producto saveProducto(ProductoDTO request){
        TipoProducto tipo = tipoRepository.findById(request.getIdTipoProducto()).orElseThrow(() -> new RuntimeException("Tipo de Producto no Encontrado"));

        Producto producto = new Producto();
        producto.setNombre(request.getNombre());
        producto.setPrecioBase(request.getPrecioBase());
        producto.setTipoProducto(tipo);
        return productoRepository.save(producto);
    }

    public List<Producto> getAllProductos() {
        return  (List<Producto>) productoRepository.findAll();
    }

    public Producto updateNombreProducto(Long id, String nuevoNombre){
        Producto producto = productoRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no Encontrado"));
        producto.setNombre(nuevoNombre);
        return productoRepository.save(producto);
    }
}