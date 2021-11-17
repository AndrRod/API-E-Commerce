package com.example.Ecommerce.Ecommerce.Models;

import java.io.InputStream;

public class Producto {
    String nombre;
    String descripcion;
    int precioUnitario;
    int codigoInventario;
    String categoria;
    InputStream foto;
    int stock;

    public Producto(){
    }
    public Producto(String nombre, String descripcion, int precioUnitario, int codigoInventario, String categoria, InputStream foto, int stock){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.codigoInventario = codigoInventario;
        this.categoria = categoria;
        this.foto = foto;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getNumeroInventario() {
        return codigoInventario;
    }

    public void setNumeroInventario(int codigoInventario) {
        this.codigoInventario = codigoInventario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
