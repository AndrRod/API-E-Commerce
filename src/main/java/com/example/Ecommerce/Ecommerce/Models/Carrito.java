package com.example.Ecommerce.Ecommerce.Models;

import java.time.LocalDate;

public class Carrito {
    LocalDate fechaCreacion;
    String usuario;
    String productosRelacionados;
    String estado;
    String observacion;

    public Carrito(){}
    public Carrito(String usuario, String productosRelacionados, String estado, String observacion){
        this.fechaCreacion = LocalDate.now();
        this.usuario = usuario;
        this.productosRelacionados = productosRelacionados;
        this.estado = estado;
        this.observacion = observacion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getProductosRelacionados() {
        return productosRelacionados;
    }

    public void setProductosRelacionados(String productosRelacionados) {
        this.productosRelacionados = productosRelacionados;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}

