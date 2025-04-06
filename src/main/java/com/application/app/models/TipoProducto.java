package com.application.app.models;

import com.application.app.enums.TipoProductoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "tipo_producto")
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Long idTipoProducto;

    @Enumerated(EnumType.STRING)
    @Column(name = "nombre", nullable = false)
    private TipoProductoEnum nombre;

    public Long getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(Long idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public TipoProductoEnum getNombre() {
        return nombre;
    }

    public void setNombre(TipoProductoEnum nombre) {
        this.nombre = nombre;
    }

    
    

}
