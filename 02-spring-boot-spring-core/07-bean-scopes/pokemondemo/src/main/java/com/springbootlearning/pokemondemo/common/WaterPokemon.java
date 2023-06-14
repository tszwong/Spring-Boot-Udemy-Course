package com.springbootlearning.pokemondemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // marks the class as a Spring bean, makes it available for dependency injection
//@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class WaterPokemon implements Pokemon {
    public WaterPokemon() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getDailyPokemon() {
        return "You get a Squirtle and a Wartortle";
    }
}
