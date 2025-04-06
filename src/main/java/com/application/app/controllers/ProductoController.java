package com.application.app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.application.app.Dto.ProductoDTO;
import com.application.app.models.Producto;
import com.application.app.services.ProductoServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    ProductoServices productoServicio;

    @GetMapping("/all")
    public List<Producto> getAllProductos() {
        return productoServicio.getAllProductos();
    }

    @PostMapping("/create")
    public Producto createProducto(@RequestBody ProductoDTO dto){
        return productoServicio.saveProducto(dto);
    }

    @PutMapping("path/{id}")
        public ResponseEntity<Producto> actualizarNombre(@RequestBody Map<String, String> body){
            String nuevoNombre = body.get("nombre");
            Long id = Long.parseLong(body.get("id"));
            Producto newProducto = productoServicio.updateNombreProducto(id, nuevoNombre);
            return ResponseEntity.ok(newProducto);
        }
}
