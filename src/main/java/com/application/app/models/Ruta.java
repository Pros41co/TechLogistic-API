package com.application.app.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ruta")
public class Ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ruta")
    private Long idRuta;

    @Column(name = "estado_ruta")
    private String estado;

    @Column(name = "fecha_estado", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaEstado;

    @Column(name = "fecha_ruta", nullable = false)
    private LocalDate fechaRuta;

    private String origen;
    private String destino;
    private Integer distancia;

    @ManyToOne
    @JoinColumn(name = "id_conductor")
    private Conductor conductor;

    public Ruta() {
    }

    public Ruta(Long idRuta, String estado, LocalDateTime fechaEstado, LocalDate fechaRuta, String origen,
            String destino, Integer distancia, Conductor conductor) {
        this.idRuta = idRuta;
        this.estado = estado;
        this.fechaEstado = fechaEstado;
        this.fechaRuta = fechaRuta;
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.conductor = conductor;
    }

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaEstado() {
        return fechaEstado;
    }

    public void setFechaEstado(LocalDateTime fechaEstado) {
        this.fechaEstado = fechaEstado;
    }

    public LocalDate getFechaRuta() {
        return fechaRuta;
    }

    public void setFechaRuta(LocalDate fechaRuta) {
        this.fechaRuta = fechaRuta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    





}
