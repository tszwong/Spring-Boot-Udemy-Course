package com.springbootlearning.pokemondemo.common;

import org.springframework.stereotype.Component;

@Component
public class FirePokemon implements Pokemon{
    public FirePokemon() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyPokemon() {
        return "You get a Charmander and Charmeleon";
    }
}
