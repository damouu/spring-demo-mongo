package com.example.springdemomongo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDemoMongoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoMongoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(PokemonRepository pokemonRepository) {
        return args -> {
            Pokemons pokemon = new Pokemons("TEST_ENTRY", "TEST_ENTRY");
            pokemonRepository.insert(pokemon);
        };
    }
}
