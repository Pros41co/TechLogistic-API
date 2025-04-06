package com.application.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Cloneable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    Long idCliente;

    String primer_nombre;
    String primer_apellido;
    String cedula;

    
    
    public Cliente() {
    }

    public Cliente(Long id_cliente, String primer_nombre, String primer_apellido, String cedula) {
        this.idCliente = id_cliente;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.cedula = cedula;
    }

    public Long getId_cliente() {
        return idCliente;
    }
    public void setId_cliente(Long id_cliente) {
        this.idCliente = id_cliente;
    }
    public String getPrimer_nombre() {
        return primer_nombre;
    }
    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }
    public String getPrimer_apellido() {
        return primer_apellido;
    }
    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
