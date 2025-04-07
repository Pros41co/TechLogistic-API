package com.application.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.app.Dto.PedidoDTO;
import com.application.app.models.Cliente;
import com.application.app.models.Pedido;
import com.application.app.models.Producto;
import com.application.app.respositories.ClientesRepositorio;
import com.application.app.respositories.PedidosRepositorio;
import com.application.app.respositories.ProductosRepositorio;

@Service
public class PedidosServices {

    @Autowired
    PedidosRepositorio pedidoRepository;

    @Autowired
    ProductosRepositorio productoRepository;

    @Autowired
    ClientesRepositorio clienteRepository;

        public Pedido savePedido(PedidoDTO request){
        Producto producto = productoRepository.findById(request.getIdProducto()).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        
        Cliente cliente = clienteRepository.findById(request.getIdCliente()).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        Pedido pedido = new Pedido();

        pedido.setCantidad(request.getCantidad());
        pedido.setCliente(cliente);
        pedido.setProducto(producto);
        pedido.calcularPrecioFinal();

        return pedidoRepository.save(pedido);
    }

    public List<Pedido> findAllPedidos(){
        return (List<Pedido>)pedidoRepository.findAll();
    }

    public Pedido updatePedido(Long id, Integer cantidad){
        Pedido pedido = pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no Encontrado"));
        pedido.setCantidad(cantidad);
        pedido.calcularPrecioFinal();
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> getPedidoPorClienteId(Long clienteId){
        return pedidoRepository.findByCliente_IdCliente(clienteId);
}
    


}
