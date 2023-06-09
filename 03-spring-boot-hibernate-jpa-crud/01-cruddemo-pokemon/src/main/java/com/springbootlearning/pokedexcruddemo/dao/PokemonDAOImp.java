package com.springbootlearning.pokedexcruddemo.dao;

import com.springbootlearning.pokedexcruddemo.entity.Pokemon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.hibernate.boot.model.source.internal.hbm.AttributesHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public List<Pokemon> findByLastName(String name) {
        // create query
        TypedQuery<Pokemon> theQuery = entityManager.createQuery("FROM Pokemon WHERE name=:theData", Pokemon.class);

        // set query parameters
        theQuery.setParameter("theData", name);

        // return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Pokemon> findAll() {
        // create query
        TypedQuery<Pokemon> theQuery = entityManager.createQuery("FROM Pokemon", Pokemon.class);

        // return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Pokemon thePokemon) {
        entityManager.merge(thePokemon);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        //retrieve the pokemon
        Pokemon thePokemon = entityManager.find(Pokemon.class, id);

        // delete the pokemon
        entityManager.remove(thePokemon);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int numRowsDeleted = entityManager.createQuery("DELETE FROM Pokemon").executeUpdate();
        return numRowsDeleted;
    }
}
