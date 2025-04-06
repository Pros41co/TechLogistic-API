package com.application.app.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prodcuto")
    private Long idProducto;

    private String nombre;

    @Column(name = "precio_base", precision = 10, scale = 2)
    private BigDecimal precioBase;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    private TipoProducto tipoProducto;

    public Producto() {
    }

    public Producto(Long idProducto, String nombre, BigDecimal precioBase, TipoProducto tipoProducto) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tipoProducto = tipoProducto;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.precioBase = precioBase;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    


}
