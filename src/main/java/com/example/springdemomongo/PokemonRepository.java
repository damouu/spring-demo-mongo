package com.example.springdemomongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PokemonRepository extends MongoRepository<Pokemons, String> {
}
