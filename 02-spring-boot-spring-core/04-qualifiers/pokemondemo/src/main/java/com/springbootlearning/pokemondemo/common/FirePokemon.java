package com.springbootlearning.pokemondemo.common;

import org.springframework.stereotype.Component;

@Component
public class FirePokemon implements Pokemon{

    @Override
    public String getDailyPokemon() {
        return "You get a Charmander and Charmeleon";
    }
}
