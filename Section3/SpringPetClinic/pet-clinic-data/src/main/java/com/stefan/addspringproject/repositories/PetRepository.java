package com.stefan.addspringproject.repositories;

import com.stefan.addspringproject.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
