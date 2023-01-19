package com.example.EleveGradle.dto;

import com.example.EleveGradle.repository.entity.Person;

public class PersonDTO {


    private Integer id;
    private String name;

    public PersonDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public PersonDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();

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
}
