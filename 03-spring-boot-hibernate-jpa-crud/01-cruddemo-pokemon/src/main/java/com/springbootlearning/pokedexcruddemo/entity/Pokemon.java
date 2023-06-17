package com.springbootlearning.pokedexcruddemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="pokemon")
public class Pokemon {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="type")
    private String type;

    // define constructors
    public Pokemon() { // no args constructor

    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // definer getters & setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }


    // define toString() method

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
