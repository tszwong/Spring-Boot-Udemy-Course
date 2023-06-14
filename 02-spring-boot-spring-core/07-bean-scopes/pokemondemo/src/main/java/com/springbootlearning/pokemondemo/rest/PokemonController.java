package com.springbootlearning.pokemondemo.rest;

import com.springbootlearning.pokemondemo.common.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    // create a private field for dependency
    private Pokemon myPokemon;
    private Pokemon anotherPokemon;

    @Autowired // constructor injection
    public void PokemonController(@Qualifier("waterPokemon") Pokemon thePokemon,
                                  @Qualifier("waterPokemon") Pokemon theAnotherPokemon) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myPokemon = thePokemon;
        anotherPokemon = theAnotherPokemon;
    }

    @GetMapping("/dailypokemon")
    public String getDailyPokemon() {
        return myPokemon.getDailyPokemon();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myPokemon == anotherPokemon, " + (myPokemon == anotherPokemon);
    }
}
