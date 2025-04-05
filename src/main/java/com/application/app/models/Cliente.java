package com.application.app.models;



public class Cliente {

    Long id_cliente;
    String primer_nombre;
    String primer_apellido;
    String cedula;

    
    public Cliente(Long id_cliente, String primer_nombre, String primer_apellido, String cedula) {
        this.id_cliente = id_cliente;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.cedula = cedula;
    }

    public Long getId_cliente() {
        return id_cliente;
    }
    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
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
