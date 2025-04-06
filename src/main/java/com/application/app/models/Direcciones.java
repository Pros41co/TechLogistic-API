package com.application.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "direcciones")
public class Direcciones {


    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id_direccion;

    String direccion;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;


    public Direcciones() {
    }

    
    public Direcciones(Long id_direccion, String direccion, Cliente cliente) {
        this.id_direccion = id_direccion;
        this.direccion = direccion;
        this.cliente = cliente;
    }


    public Long getId_direccion() {
        return id_direccion;
    }


    public void setId_direccion(Long id_direccion) {
        this.id_direccion = id_direccion;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

}
