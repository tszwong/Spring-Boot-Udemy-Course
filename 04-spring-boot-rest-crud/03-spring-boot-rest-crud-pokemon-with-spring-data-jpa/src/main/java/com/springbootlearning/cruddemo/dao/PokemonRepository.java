package com.springbootlearning.cruddemo.dao;

import com.springbootlearning.cruddemo.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {}
