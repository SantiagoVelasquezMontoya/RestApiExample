package com.example.EleveGradle.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.EleveGradle.repository.entity.Person;

public interface IPersonRepository extends CrudRepository<Person, Integer> {
}
