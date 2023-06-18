package com.springbootlearning.pokedexcruddemo.dao;

import com.springbootlearning.pokedexcruddemo.entity.Pokemon;

public interface PokemonDAO {
    void save(Pokemon thePokemon);

    Pokemon findById(Integer id);
}
