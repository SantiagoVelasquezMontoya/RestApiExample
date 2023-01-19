package com.example.EleveGradle.services;

import com.example.EleveGradle.dto.PersonDTO;

import java.util.List;

public interface IPersonService {

    void save(PersonDTO person);

    List<PersonDTO> getAll();

    String update(PersonDTO person);

}
