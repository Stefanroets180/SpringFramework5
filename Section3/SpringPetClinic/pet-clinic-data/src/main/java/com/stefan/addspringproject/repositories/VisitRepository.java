package com.stefan.addspringproject.repositories;

import com.stefan.addspringproject.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
