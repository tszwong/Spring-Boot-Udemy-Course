package com.springbootlearning.demo.rest;

import com.springbootlearning.demo.entity.Pokemon;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PokemonRestController {
    private List<Pokemon> thePokemons;

    // define @PostConstruct to load the pokemon data only once
    @PostConstruct
    public void loadData() {
        // create/hardcode some pokemons
        thePokemons = new ArrayList<>();
        thePokemons.add(new Pokemon("Squirtle", "Water"));
        thePokemons.add(new Pokemon("Charmander", "Fire"));
        thePokemons.add(new Pokemon("Bulbasaur", "Grass"));
        thePokemons.add(new Pokemon("Pichaku", "Electric"));
    }

    // define endpoint for "/pokemon" - returns a list of pokemon
    @GetMapping("/pokemons")
    public List<Pokemon> getPokemons() {
        return thePokemons;
    }

    // define endpoint or "/pokemons/{pokemonId}" - return pokemon at index
    @GetMapping("/pokemons/{pokemonId}")
    public Pokemon getPokemon(@PathVariable int pokemonId) {
        // index into the list to keep it simple
        return thePokemons.get(pokemonId);
    }

}
