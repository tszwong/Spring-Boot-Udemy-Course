package com.springbootlearning.cruddemo.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name="pokemon")
public class Pokemon {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @Column(name = "trainer")
    private String trainer;

    // define constructors
    public Pokemon() {}

    public Pokemon(String name, String type, String trainer) {
        this.name = name;
        this.type = type;
        this.trainer = trainer;
    }

    // define getters/setters
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

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    // define toString
    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", trainer='" + trainer + '\'' +
                '}';
    }
}
