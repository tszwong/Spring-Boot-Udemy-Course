package com.springbootlearning.pokemondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    // create a private field for dependency
    private Pokemon myPokemon;

    // define a constructor for dependency injection
    @Autowired // tells Spring to inject a dependency
    public PokemonController(Pokemon thePokemon) {
        myPokemon = thePokemon;
    }

    @GetMapping("/dailypokemon")
    public String getDailyPokemon() {
        return myPokemon.getDailyPokemon();
    }
}
