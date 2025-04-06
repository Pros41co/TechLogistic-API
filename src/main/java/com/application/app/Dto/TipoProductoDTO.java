package com.application.app.Dto;

import com.application.app.enums.TipoProductoEnum;

public class TipoProductoDTO {

    private TipoProductoEnum nombre;

    public TipoProductoDTO() {
    }

    public TipoProductoDTO(TipoProductoEnum nombre) {
        this.nombre = nombre;
    }

    public TipoProductoEnum getNombre() {
        return nombre;
    }

    public void setNombre(TipoProductoEnum nombre) {
        this.nombre = nombre;
    }
}
