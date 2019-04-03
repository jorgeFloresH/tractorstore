package com.remedial.tractorstore.service;

import com.remedial.tractorstore.model.Foto;
import com.remedial.tractorstore.repositories.FotoRepository;
import com.remedial.tractorstore.repositories.GenericRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class FotoServiceImpl extends GenericServiceImpl<Foto> implements FotoService {
    private final FotoRepository repository;

    public FotoServiceImpl(FotoRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<Foto> getRepository(){return repository;}

    @Override
    public void saveImage(Long id, InputStream file) {
        Foto fotoPersisted = findById(id);
        try {
            Byte[] bytes = ImageUtils.inputStreamToByteArray(file);
            fotoPersisted.setImagen(bytes);
            getRepository().save(fotoPersisted);
        } catch (IOException e) {
            logger.error("Error reading file", e);
            e.printStackTrace();
        }
    }
}

