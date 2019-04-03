package com.remedial.tractorstore.service;

import com.remedial.tractorstore.model.Catalogo;
import com.remedial.tractorstore.repositories.CatalogoRepository;
import com.remedial.tractorstore.repositories.GenericRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogoServiceImpl extends  GenericServiceImpl<Catalogo> implements  CatalogoService{

    private  final CatalogoRepository repository;

    public CatalogoServiceImpl(CatalogoRepository repository) {
        this.repository = repository;
    }
    @Override
    protected GenericRepository<Catalogo> getRepository(){ return repository;}

    @Override
    public List<Catalogo> findByCode(String code) {
        return repository.findByCode(code);
    }
}
