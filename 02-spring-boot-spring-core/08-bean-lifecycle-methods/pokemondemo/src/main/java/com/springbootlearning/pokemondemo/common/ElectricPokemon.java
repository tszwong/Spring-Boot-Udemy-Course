package com.springbootlearning.pokemondemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ElectricPokemon implements Pokemon{

    // no args constructor
    public ElectricPokemon() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyPokemon() {
        return "You get a Pikachu and Raichu";
    }
}
