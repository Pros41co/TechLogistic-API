package com.application.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdVehiculo;

    @Column(name = "placa")
    String placa;

    @Column(name = "marca")
    String marca;

    public Vehiculo() {
    }

    public Vehiculo(Long idVehiculo, String placa, String marca) {
        IdVehiculo = idVehiculo;
        this.placa = placa;
        this.marca = marca;
    }

    public Long getIdVehiculo() {
        return IdVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        IdVehiculo = idVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
}
