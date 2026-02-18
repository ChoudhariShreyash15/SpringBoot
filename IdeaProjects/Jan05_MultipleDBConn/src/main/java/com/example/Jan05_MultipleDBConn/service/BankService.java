package com.example.Jan05_MultipleDBConn.service;

import com.example.Jan05_MultipleDBConn.mysqlEntity.Person;
import com.example.Jan05_MultipleDBConn.mysqlRepo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BankService {

    @Autowired
    private PersonRepo personRepo;

    public Optional<Person> getPersonById(Integer id){
        return personRepo.findById(id);
    }

    public List<Person> getAllPerson(){
        return personRepo.findAll();
    }

    public Person addPerson(Person person){
        return personRepo.save(person);
    }

    public Person updatePerson(Person person){
        return personRepo.save(person);
    }

    public void deletePerson(Integer id){
        personRepo.deleteById(id);
    }
}
