package com.application.app.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.app.Dto.EntregaDTO;
import com.application.app.enums.EstadoEntregaEnum;
import com.application.app.models.Entrega;
import com.application.app.models.Pedido;
import com.application.app.models.Ruta;
import com.application.app.respositories.EntregaRepositorio;
import com.application.app.respositories.PedidosRepositorio;
import com.application.app.respositories.RutasRepositorio;

@Service
public class EntregaServices {

    @Autowired
    EntregaRepositorio entregaRepository;

    @Autowired
    RutasRepositorio rutaRepository;

    @Autowired
    PedidosRepositorio pedidoRepository;

    public List<Entrega> findAllEntregas(){
        return (List<Entrega>)entregaRepository.findAll();
    }

    public Entrega saveEntrega(EntregaDTO dto){
        Ruta ruta = rutaRepository.findById(dto.getIdRuta()).orElseThrow(() -> new RuntimeException("Ruta no encontrada"));
        Pedido pedido = pedidoRepository.findById(dto.getIdPedido()).orElseThrow(() -> new RuntimeException("Pedido no encontrado"));
        Entrega entrega = new Entrega();
        entrega.setEstado(dto.getEstado());
        entrega.setFechaEstado(LocalDateTime.now());
        entrega.setPedido(pedido);
        entrega.setRuta(ruta);
        return entregaRepository.save(entrega);
    }

      public Entrega updateEstadoEntrega(Long id, EstadoEntregaEnum nuevoEstado){
        Entrega entrega = entregaRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no Encontrado"));
        entrega.setEstado(nuevoEstado);
        return entregaRepository.save(entrega);
    }



}
