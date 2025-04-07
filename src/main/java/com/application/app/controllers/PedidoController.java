package com.application.app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.application.app.Dto.PedidoDTO;
import com.application.app.models.Pedido;
import com.application.app.services.PedidosServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    PedidosServices pedidoServicio;

    @GetMapping("/all")
    public List<Pedido> getAllPedidos(){
        return pedidoServicio.findAllPedidos();
    }

    @GetMapping
    public List<Pedido> getPedidosByIdCliente(@RequestParam(name = "idCliente") Long idCliente){
        List<Pedido> pedidos = pedidoServicio.getPedidoPorClienteId(idCliente);
        return pedidos;
    }
    
    @PostMapping("/create")
    public Pedido createPedido(@RequestBody PedidoDTO dto){
        return pedidoServicio.savePedido(dto);
    }

    @PutMapping("/modificar")
    public ResponseEntity<Pedido> actualizarPedido(@RequestBody Map<String, String> body){
        Integer cantidad = Integer.parseInt(body.get("cantidad"));
        Long id = Long.parseLong(body.get("id"));
        Pedido newPedido = pedidoServicio.updatePedido(id, cantidad);
        return ResponseEntity.ok(newPedido);
    }

}
