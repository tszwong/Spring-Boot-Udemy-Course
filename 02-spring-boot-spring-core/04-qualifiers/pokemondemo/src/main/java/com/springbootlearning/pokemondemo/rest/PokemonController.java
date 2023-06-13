package com.springbootlearning.pokemondemo.rest;

import com.springbootlearning.pokemondemo.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    // create a private field for dependency
    private Pokemon myPokemon;

//    @Autowired // constructor injection
//    public void PokemonController(@Qualifier("waterPokemon") Pokemon thePokemon) {
//        myPokemon = thePokemon;
//    }

    // an alternative to @Qualifier we can mark a bean as the @Primary
    @Autowired
    public void PokemonController(Pokemon thePokemon) {
        myPokemon = thePokemon;
    }

    @GetMapping("/dailypokemon")
    public String getDailyPokemon() {
        return myPokemon.getDailyPokemon();
    }
}
