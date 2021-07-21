package com.stefan.addspringproject.repositories;

import com.stefan.addspringproject.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
