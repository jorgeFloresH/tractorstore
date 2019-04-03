package com.remedial.tractorstore.service;

import com.remedial.tractorstore.model.Foto;

import java.io.InputStream;

public interface FotoService extends GenericService<Foto>{
    void saveImage(Long id, InputStream file);
}
