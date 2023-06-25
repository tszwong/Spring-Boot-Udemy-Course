package com.springbootlearning.cruddemo.dao;

import com.springbootlearning.cruddemo.entity.Pokemon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PokemonDaoJpaImp implements PokemonDAO{
    // define fields for entity manager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public PokemonDaoJpaImp(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Pokemon> findAll() {
        // create a query
        TypedQuery<Pokemon> theQuery = entityManager.createQuery("from Pokemon", Pokemon.class);

        // execute query and get result list
        List<Pokemon> pokemons = theQuery.getResultList();

        // return the results
        return pokemons;
    }
}
