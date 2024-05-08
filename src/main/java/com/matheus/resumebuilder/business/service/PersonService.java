package com.matheus.resumebuilder.business.service;

import com.matheus.resumebuilder.application.dao.PersonDao;
import com.matheus.resumebuilder.business.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public List<Person> findAll() {
        return this.personDao.findAll();
    }

    public Person findById(final UUID id) {
        return this.personDao.findById(id).orElse(null);
    }

    @Transactional
    public Person create(final Person person) {
        return this.personDao.save(person);
    }

    @Transactional
    public Person update(final UUID id, Person person) {
        person.setId(id);
        return this.personDao.save(person);
    }

    @Transactional
    public void deleteById(final UUID id) {
        this.personDao.deleteById(id);
    }
}