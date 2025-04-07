package com.application.app.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.application.app.models.Pedido;

public interface PedidosRepositorio extends CrudRepository<Pedido, Long>{

    List<Pedido> findByCliente_IdCliente(Long idCliente);

}
