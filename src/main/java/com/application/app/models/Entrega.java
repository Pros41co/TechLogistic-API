package com.application.app.models;
import java.time.LocalDateTime;
import com.application.app.enums.EstadoEntregaEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Entrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrega")
    private Long idEntrega;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    EstadoEntregaEnum estado;

    @Column(name = "fecha_estado", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaEstado;

    @ManyToOne
    @JoinColumn(name = "id_ruta")
    Ruta ruta;

    @ManyToOne
    @JoinColumn(name = "id_pedido")
    Pedido pedido;

    public Entrega() {
    }

    public Entrega(Long idEntrega, EstadoEntregaEnum estado, LocalDateTime fechaEstado, Ruta ruta, Pedido pedido) {
        this.idEntrega = idEntrega;
        this.estado = estado;
        this.fechaEstado = fechaEstado;
        this.ruta = ruta;
        this.pedido = pedido;
    }

    public Long getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Long idEntrega) {
        this.idEntrega = idEntrega;
    }

    public EstadoEntregaEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoEntregaEnum estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaEstado() {
        return fechaEstado;
    }

    public void setFechaEstado(LocalDateTime fechaEstado) {
        this.fechaEstado = fechaEstado;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    

}
