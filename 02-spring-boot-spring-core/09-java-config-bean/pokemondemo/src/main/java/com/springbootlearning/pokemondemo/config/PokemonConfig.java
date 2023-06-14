package com.springbootlearning.pokemondemo.config;

import com.springbootlearning.pokemondemo.common.FairyPokemon;
import com.springbootlearning.pokemondemo.common.Pokemon;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PokemonConfig {
    // defining the Bean method
    @Bean("fairy") // @Bean({ID of bean})
    public Pokemon fairyPokemon() {
        return new FairyPokemon();
    }
}
