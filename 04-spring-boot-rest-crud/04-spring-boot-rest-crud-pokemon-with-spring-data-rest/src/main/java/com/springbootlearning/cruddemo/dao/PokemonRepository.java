package com.springbootlearning.cruddemo.dao;

import com.springbootlearning.cruddemo.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @RepositoryRestResource(path = "members")
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {}
