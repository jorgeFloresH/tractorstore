package com.remedial.tractorstore.model;

import javax.persistence.Entity;

@Entity
public class Catalogo extends ModelBase {


    private String name;
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
