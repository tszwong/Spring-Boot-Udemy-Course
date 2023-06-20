package com.springbootlearning.pokedexcruddemo.dao;

import com.springbootlearning.pokedexcruddemo.entity.Pokemon;

import java.util.List;

public interface PokemonDAO {
    void save(Pokemon thePokemon);
    Pokemon findById(Integer id);

    List<Pokemon> findByLastName(String name);

    List<Pokemon> findAll();
    void update(Pokemon pokemon);
    void delete(Integer id);
    int deleteAll();
}
