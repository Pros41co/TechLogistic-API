package com.application.app.Dto;
import com.application.app.enums.EstadoEntregaEnum;

public class EntregaDTO {
    EstadoEntregaEnum estado;
    Long idRuta;
    Long idPedido;
    
    public EstadoEntregaEnum getEstado() {
        return estado;
    }
    public void setEstado(EstadoEntregaEnum estado) {
        this.estado = estado;
    }
    public Long getIdRuta() {
        return idRuta;
    }
    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }
    public Long getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    

}
