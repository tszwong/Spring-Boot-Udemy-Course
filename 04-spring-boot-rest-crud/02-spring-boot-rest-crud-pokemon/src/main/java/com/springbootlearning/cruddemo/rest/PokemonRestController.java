package com.springbootlearning.cruddemo.rest;

import com.springbootlearning.cruddemo.dao.PokemonDAO;
import com.springbootlearning.cruddemo.entity.Pokemon;
import com.springbootlearning.cruddemo.service.PokemonService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PokemonRestController {
    // define fields
    // private PokemonDAO pokemonDAO;
    private PokemonService pokemonService;

    // inject pokemon dao
    @Autowired
    public PokemonRestController(PokemonService thePokemonService) {
        pokemonService = thePokemonService;
    }

    // expose "/pokemons" and return a list of pokemons
    @GetMapping("/pokemons")
    public List<Pokemon> findAll() {
        return pokemonService.findAll();
    }

    // mapping for GET /pokemons/{pokemonId}
    @GetMapping("/pokemons/{pokemonId}")
    public Pokemon getPokemon(@PathVariable int pokemonId) {
        Pokemon thePokemon = pokemonService.findById(pokemonId);

        if (thePokemon == null) {
            throw new RuntimeException("Pokemon id not found - " + pokemonId);
        }

        return thePokemon;
    }

    // mapping for POST /pokemons - add new pokemon
    @PostMapping("/pokemons")
    public Pokemon addPokemon(@RequestBody Pokemon thePokemon) {
        // in case they pass an id in JSON, set id to 0
        // this will force a save of a new item instead of update
        thePokemon.setId(0);
        Pokemon dbPokemon = pokemonService.save(thePokemon);
        return dbPokemon;
    }

    // mapping for PUT /pokemons - update existing pokemon
    @PutMapping("/pokemons")
    public Pokemon updatePokemon(@RequestBody Pokemon thePokemon) {
        Pokemon dbPokemon = pokemonService.save(thePokemon);
        return dbPokemon;
    }
}
