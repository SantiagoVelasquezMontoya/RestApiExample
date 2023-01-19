package com.example.EleveGradle.services.imple;

import com.example.EleveGradle.dto.PersonDTO;
import com.example.EleveGradle.repository.IPersonRepository;
import com.example.EleveGradle.repository.entity.Person;
import com.example.EleveGradle.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class PersonaServiceImpl implements IPersonService {


    private final IPersonRepository repository;

    public PersonaServiceImpl(IPersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(PersonDTO person) {

        repository.save(new Person(person));
    }

    @Override
    public List<PersonDTO> getAll() {
        List<Person> list = (List<Person>) repository.findAll();
        return  list.stream()
                .map(PersonDTO::new)
                .collect(Collectors.toList());


    }

    @Override
    public String update(PersonDTO person) {
        Optional<Person> value = repository.findById(person.getId());
        if(value.isPresent()){
            repository.save(new Person(person));
            return "Updated";
        } else{
            return "Person doesn't Exists";
        }
    }
}
