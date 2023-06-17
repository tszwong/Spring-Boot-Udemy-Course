package com.springbootlearning.pokedexcruddemo;

import com.springbootlearning.pokedexcruddemo.dao.PokemonDAO;
import com.springbootlearning.pokedexcruddemo.entity.Pokemon;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PokedexcruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokedexcruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PokemonDAO pokemonDAO) { // inject PokemonDAO
		return runner -> { // Java Lambda expression
			createPokemon(pokemonDAO);
		};
	}

	private void createPokemon(PokemonDAO pokemonDAO) {
		// create the pokemon object
		System.out.println("Creating new pokemon object");
		Pokemon tempPokemon = new Pokemon("Squirtle", "Water");

		// save the pokemon object
		System.out.println("Saving the pokemon...");
		pokemonDAO.save(tempPokemon);

		// display the id of the saved pokemon
		System.out.println("Saved pokemon. Generated id: " + tempPokemon.getId());
	}

}
