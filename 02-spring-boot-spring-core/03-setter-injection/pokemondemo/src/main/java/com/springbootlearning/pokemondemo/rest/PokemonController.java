package com.springbootlearning.pokemondemo.rest;

import com.springbootlearning.pokemondemo.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    // create a private field for dependency
    private Pokemon myPokemon;

    @GetMapping("/dailypokemon")
    public String getDailyPokemon() {
        return myPokemon.getDailyPokemon();
    }
}
