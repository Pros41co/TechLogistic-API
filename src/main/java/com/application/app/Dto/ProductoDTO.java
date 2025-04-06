package com.application.app.Dto;

import java.math.BigDecimal;

public class ProductoDTO {
    
    private String nombre;
    private BigDecimal precioBase;
    private Long idTipoProducto;


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
    public Long getIdTipoProducto() {
        return idTipoProducto;
    }
    public void setIdTipoProducto(Long idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    

}
