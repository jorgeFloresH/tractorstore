package com.remedial.tractorstore.service;

import com.remedial.tractorstore.model.Tractor;
import com.remedial.tractorstore.repositories.GenericRepository;
import com.remedial.tractorstore.repositories.TractorRepository;
import org.springframework.stereotype.Service;

@Service
public class TractorServiceImpl extends GenericServiceImpl<Tractor> implements TractorService{
    private final TractorRepository repository;

    public TractorServiceImpl(TractorRepository repository) {
        this.repository = repository;

    }

    @Override
    protected GenericRepository<Tractor> getRepository(){return repository;}
}
