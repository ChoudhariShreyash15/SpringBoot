package com.example.SpringBootMapping.controller;

import com.example.SpringBootMapping.entity.Person;
import com.example.SpringBootMapping.service.PersonService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person){
        return personService.addPerson(person);
    }

    @GetMapping("/get")
    public Person getPerson(@RequestParam int id){
        return personService.getById(id);
    }
}
