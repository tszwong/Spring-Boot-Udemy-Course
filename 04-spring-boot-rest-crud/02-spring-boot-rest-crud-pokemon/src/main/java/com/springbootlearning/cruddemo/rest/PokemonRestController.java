package com.springbootlearning.cruddemo.rest;

import com.springbootlearning.cruddemo.dao.PokemonDAO;
import com.springbootlearning.cruddemo.entity.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PokemonRestController {
    // define fields
    private PokemonDAO pokemonDAO;

    // inject pokemon dao
    public PokemonRestController(PokemonDAO thePokemonDAO) {
        pokemonDAO = thePokemonDAO;
    }

    // expose "/pokemons" and return a list of pokemons
    @GetMapping("/pokemons")
    public List<Pokemon> findAll() {
        return pokemonDAO.findAll();
    }

}
