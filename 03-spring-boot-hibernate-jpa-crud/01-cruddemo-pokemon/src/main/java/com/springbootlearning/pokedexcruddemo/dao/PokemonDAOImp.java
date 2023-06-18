package com.springbootlearning.pokedexcruddemo.dao;

import com.springbootlearning.pokedexcruddemo.entity.Pokemon;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository // supports component scanning and translates JDBC exceptions
public class PokemonDAOImp implements PokemonDAO{

    // define field for entity manager
    private EntityManager entityManager;

    // inject entity manager using constructor injection
    @Autowired
    public PokemonDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Pokemon thePokemon) {
        entityManager.persist(thePokemon); // saves the pokemon to the database
    }

    // implement find by id method
    @Override
    public Pokemon findById(Integer id) {
        return entityManager.find(Pokemon.class, id);
    }
}
