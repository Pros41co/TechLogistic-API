package com.application.app.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.application.app.models.Direcciones;
import com.application.app.Dto.DireccionesDTO;
import com.application.app.models.Cliente;
import com.application.app.respositories.ClientesRepositorio;
import com.application.app.respositories.DireccionesRepositories;


@Service
public class DireccionesServices {

    @Autowired
    private DireccionesRepositories direccionRepository;

    @Autowired
    private ClientesRepositorio clienteRepository;

    public List<Direcciones> getDireccionPorClienteId(Long clienteId){
        return direccionRepository.findByCliente_IdCliente(clienteId);
    }

    public Direcciones crearDireccion(DireccionesDTO request){
        Cliente cliente = clienteRepository.findById(request.getIdCliente()).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        Direcciones direccion = new Direcciones();
        direccion.setCliente(cliente);
        direccion.setDireccion(request.getDireccion());

        return direccionRepository.save(direccion);
    }
}
