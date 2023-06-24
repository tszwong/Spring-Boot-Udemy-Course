package com.springbootlearning.demo.rest;

import com.springbootlearning.demo.entity.Pokemon;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        // check the pokemonId against the list size
        if ((pokemonId >= thePokemons.size()) || (pokemonId < 0)) {
            throw new PokemonNotFoundException("Pokemon id not found - " + pokemonId);
        }

        return thePokemons.get(pokemonId);
    }

//    // add an exception handler using @ExceptionHandler
//    @ExceptionHandler
//    public ResponseEntity<PokemonErrorResponse> handleException(PokemonNotFoundException exception) {
//        // create a PokemonErrorResponse
//        PokemonErrorResponse error = new PokemonErrorResponse();
//        error.setStatus(HttpStatus.NOT_FOUND.value()); // 404
//        error.setMessage(exception.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        // return a ResponseEntity
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }
//
//    // add another exception handler to catch all exceptions
//    @ExceptionHandler
//    public ResponseEntity<PokemonErrorResponse> handleException(Exception exception) {
//        // create a PokemonErrorResponse
//        PokemonErrorResponse error = new PokemonErrorResponse();
//        error.setStatus(HttpStatus.BAD_REQUEST.value()); // 400
//        error.setMessage(exception.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        // return a ResponseEntity
//        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//    }

}
