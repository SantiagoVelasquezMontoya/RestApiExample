package com.example.EleveGradle.repository.entity;


import com.example.EleveGradle.dto.PersonDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {

    @Id
    private Integer id;
    private String name;


    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(PersonDTO personDTO){
        this.id = personDTO.getId();
        this.name = personDTO.getName();

    }
}
