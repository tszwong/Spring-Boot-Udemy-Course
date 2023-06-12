package com.springbootlearning.pokemondemo.common;

import org.springframework.stereotype.Component;

@Component
public class ElectricPokemon implements Pokemon{
    @Override
    public String getDailyPokemon() {
        return "You get a Pikachu and Raichu";
    }
}
