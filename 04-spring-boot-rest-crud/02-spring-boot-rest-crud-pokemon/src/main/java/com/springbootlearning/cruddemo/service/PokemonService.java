package com.springbootlearning.cruddemo.service;

import com.springbootlearning.cruddemo.entity.Pokemon;

import java.util.List;

public interface PokemonService {
    List<Pokemon> findAll();
    Pokemon findById(int theId);
    Pokemon save(Pokemon thePokemon);
    void deleteById(int theId);
}
