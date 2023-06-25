package com.springbootlearning.cruddemo.dao;

import com.springbootlearning.cruddemo.entity.Pokemon;

import java.util.List;

public interface PokemonDAO {
    List<Pokemon> findAll();
}
