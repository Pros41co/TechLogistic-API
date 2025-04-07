package com.application.app.Dto;

import java.time.LocalDate;

public class RutaDTO {
    private String estado;
    private LocalDate fechaRuta;
    private String origen;
    private String destino;
    private Integer distancia;
    private Long idConductor;

    

    public RutaDTO() {
    }

    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
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
    public Long getIdConductor() {
        return idConductor;
    }
    public void setIdConductor(Long idConductor) {
        this.idConductor = idConductor;
    }
}
