package com.remedial.tractorstore.service;

import com.remedial.tractorstore.dto.DtoBase;
import com.remedial.tractorstore.model.ModelBase;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface GenericService<T extends ModelBase> {
    List<T> findAll();

    T findById(Long id);

    T save(T model);

    T patch(DtoBase dto, T model);

    List<T> saveAll(Iterable<T> models);

    void deleteById(Long id);

    Byte[] getBytes(MultipartFile file);

}
