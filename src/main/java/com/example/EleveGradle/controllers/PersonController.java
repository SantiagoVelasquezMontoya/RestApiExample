package com.example.EleveGradle.controllers;


import com.example.EleveGradle.dto.PersonDTO;
import com.example.EleveGradle.repository.entity.Person;
import com.example.EleveGradle.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {



    @Autowired

    public final IPersonService iPersonService;

    public PersonController(IPersonService iPersonService) {
        this.iPersonService = iPersonService;
    }



    @GetMapping()
    public ResponseEntity<List<PersonDTO>> getPeople(){
        return ResponseEntity.ok().body(iPersonService.getAll());

    }

    @PostMapping()
    public ResponseEntity<?> savePerson(@RequestBody PersonDTO person){
        iPersonService.save(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<?>  updatePerson (@RequestBody PersonDTO person){
        return new ResponseEntity<>(iPersonService.update(person), HttpStatus.CREATED);
    }


}
