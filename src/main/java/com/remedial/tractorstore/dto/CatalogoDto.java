package com.remedial.tractorstore.dto;

import com.remedial.tractorstore.model.Catalogo;
import com.remedial.tractorstore.repositories.GenericRepository;

public class CatalogoDto extends DtoBase<Catalogo> {
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
