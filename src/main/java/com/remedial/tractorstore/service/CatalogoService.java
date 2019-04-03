package com.remedial.tractorstore.service;

import com.remedial.tractorstore.model.Catalogo;

import java.util.List;

public interface CatalogoService extends  GenericService<Catalogo> {

    List<Catalogo> findByCode(String Code);
}
