package com.example.demo.dao;

import com.example.demo.model.person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("postgres")
public class PersonDataAccessService  implements  PersonDao{
    @Override
    public int insertPerson(UUID id, person person) {
        return 0;
    }

    @Override
    public List<person> selectAllPeople() {
        return  List.of(new person(UUID.randomUUID(),"FROM POSTGRES DB"));
    }

    @Override
    public Optional<person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int upDatePersonById(UUID id, person person) {
        return 0;
    }
}
