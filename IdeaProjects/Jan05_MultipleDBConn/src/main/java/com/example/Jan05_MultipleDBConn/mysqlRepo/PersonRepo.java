package com.example.Jan05_MultipleDBConn.mysqlRepo;

import com.example.Jan05_MultipleDBConn.mysqlEntity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends JpaRepository<Person, Integer> {
}
