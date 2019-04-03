package com.remedial.tractorstore.dto;

import com.remedial.tractorstore.model.Catalogo;
import com.remedial.tractorstore.model.ModelBase;
import com.remedial.tractorstore.model.Tractor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


public class TractorDto extends DtoBase<Tractor> {

    private String name;
    private String marca;


    private Catalogo catalogo;
    private int fabricacion;
    private double precio;
    private String descripcion;
    private boolean estado;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
