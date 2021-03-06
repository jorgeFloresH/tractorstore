package com.remedial.tractorstore.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Foto extends ModelBase {
    private String nombre;
    private String ruta;
    private Byte[] imagen;

    @ManyToOne(optional = false)
    private Tractor tractor;

    public Tractor getTractor() {
        return tractor;
    }

    public void setTractor(Tractor tractor) {
        this.tractor = tractor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Byte[] getImagen() {
        return imagen;
    }

    public void setImagen(Byte[] imagen) {
        this.imagen = imagen;
    }


}
