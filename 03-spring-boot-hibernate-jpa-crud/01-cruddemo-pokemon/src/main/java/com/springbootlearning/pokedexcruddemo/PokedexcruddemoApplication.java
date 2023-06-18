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
			//createPokemon(pokemonDAO);
			//createMultiplePokemons(pokemonDAO);

			readPokemon(pokemonDAO);
		};
	}

	private void readPokemon(PokemonDAO pokemonDAO) {
		// create a pokemon object
		System.out.println("Creating new pokemon object...");
		Pokemon tempPokemon = new Pokemon("Raichu", "Electric");

		// save the student
		System.out.println("Saving the pokemon...");
		pokemonDAO.save(tempPokemon);

		// display id of the saved pokemon
		int theId = tempPokemon.getId();
		System.out.println("Saved pokemon. Generated id: " + theId);

		// retrieve pokemon based on the id: primary key
		System.out.println("Retrieving pokemon with id: " + theId);
		Pokemon myPokemon = pokemonDAO.findById(theId);

		// display pokemon
		System.out.println("Found the pokemon: " + myPokemon);
	}

	private void createMultiplePokemons(PokemonDAO pokemonDAO) {
		// create multiple pokemons
		System.out.println("Creating new pokemon objects...");
		Pokemon tempPokemon1 = new Pokemon("Charmander", "Fire");
		Pokemon tempPokemon2 = new Pokemon("Bulbasaur", "Grass");
		Pokemon tempPokemon3 = new Pokemon("Pikachu", "Electric");

		// save the pokemon objects
		System.out.println("Saving the pokemons...");
		pokemonDAO.save(tempPokemon1);
		pokemonDAO.save(tempPokemon2);
		pokemonDAO.save(tempPokemon3);
	}

	private void createPokemon(PokemonDAO pokemonDAO) {
		// create the pokemon object
		System.out.println("Creating new pokemon object...");
		Pokemon tempPokemon = new Pokemon("Squirtle", "Water");

		// save the pokemon object
		System.out.println("Saving the pokemon...");
		pokemonDAO.save(tempPokemon);

		// display the id of the saved pokemon
		System.out.println("Saved pokemon. Generated id: " + tempPokemon.getId());
	}

}
