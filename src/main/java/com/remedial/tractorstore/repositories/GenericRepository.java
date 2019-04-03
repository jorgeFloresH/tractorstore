package com.remedial.tractorstore.repositories;

import com.remedial.tractorstore.model.ModelBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenericRepository<T extends ModelBase> extends JpaRepository<T, Long> {
}
