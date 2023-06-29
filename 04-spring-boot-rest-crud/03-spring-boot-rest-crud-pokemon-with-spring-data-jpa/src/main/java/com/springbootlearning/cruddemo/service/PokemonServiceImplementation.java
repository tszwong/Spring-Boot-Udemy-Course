package com.springbootlearning.cruddemo.service;

import com.springbootlearning.cruddemo.dao.PokemonRepository;
import com.springbootlearning.cruddemo.entity.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonServiceImplementation implements PokemonService{

    private PokemonRepository pokemonRepository;

    @Autowired
    public PokemonServiceImplementation(PokemonRepository thePokemonRepository) {
        pokemonRepository = thePokemonRepository;
    }

    @Override
    public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }

    @Override
    public Pokemon findById(int theId) {
        Optional<Pokemon> result = pokemonRepository.findById(theId);

        Pokemon thePokemon = null;
        if (result.isPresent()) {
            thePokemon = result.get();
        }
        else {
            // if we don't find the pokemon
            throw new RuntimeException("Did not find pokemon id - " + theId);
        }

        return thePokemon;
    }

    @Override
    public Pokemon save(Pokemon thePokemon) {
        return pokemonRepository.save(thePokemon);
    }

    @Override
    public void deleteById(int theId) {
        pokemonRepository.deleteById(theId);
    }
}
