package com.springbootlearning.cruddemo.service;

import com.springbootlearning.cruddemo.dao.PokemonDAO;
import com.springbootlearning.cruddemo.entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PokemonServiceImplementation implements PokemonService{

    private PokemonDAO pokemonDAO;

    @Autowired
    public PokemonServiceImplementation(PokemonDAO thePokemonDAO) {
        pokemonDAO = thePokemonDAO;
    }

    @Override
    public List<Pokemon> findAll() {
        return pokemonDAO.findAll();
    }

    @Override
    public Pokemon findById(int theId) {
        return pokemonDAO.findById(theId);
    }

    @Transactional
    @Override
    public Pokemon save(Pokemon thePokemon) {
        return pokemonDAO.save(thePokemon);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        pokemonDAO.deleteById(theId);
    }
}
