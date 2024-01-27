package com.luminahi.datarest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pokemon", path = "pokemon")
public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {
    
}
