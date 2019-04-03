package com.remedial.tractorstore.repositories;

import com.remedial.tractorstore.model.Catalogo;

import java.util.List;

public interface CatalogoRepository extends GenericRepository<Catalogo> {
    List<Catalogo> findByCode(String code);
}
