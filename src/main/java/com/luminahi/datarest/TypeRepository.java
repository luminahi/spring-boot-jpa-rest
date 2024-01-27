package com.luminahi.datarest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "types", path = "types")
public interface TypeRepository extends CrudRepository<Type, Integer> {
    
}
