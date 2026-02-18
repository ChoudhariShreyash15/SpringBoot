package com.example.Jan05_MultipleDBConn.controller;

import com.example.Jan05_MultipleDBConn.mysqlEntity.Person;
import com.example.Jan05_MultipleDBConn.service.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class BankController {
    final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable Integer id){
        return bankService.getPersonById(id);
    }

    @GetMapping("/id")
    public List<Person> getAllPersons(@RequestParam Integer id){
        return bankService.getAllPerson();
    }

    @PostMapping("/add")
    public Person addPerson(@RequestBody Person person){
        return bankService.addPerson(person);
    }

    @PutMapping("/update")
    public Person updatPerson(@RequestBody Person person){
        return bankService.updatePerson(person);
    }

    @DeleteMapping("/delete")
    public void deletePerson(@RequestParam Integer id){
        bankService.deletePerson(id);
    }

}
