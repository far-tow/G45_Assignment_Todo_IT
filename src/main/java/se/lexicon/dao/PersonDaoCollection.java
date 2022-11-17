////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.dao;

import se.lexicon.AppUser;
import se.lexicon.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class PersonDaoCollection implements PersonDao {
    private List<Person> persons = new ArrayList<>(); //changes !!!!
    Person person = new Person();


    @Override
    public Person persist(Person person) {
        if (person == null) throw new IllegalArgumentException("person was null");
        Person result = findById(person.getId());
        if (result != null) throw new IllegalArgumentException("userId was duplicate");
        persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        if (id == 0) throw new IllegalArgumentException("id was null");
        for (Person currentElement : persons) {
            if (currentElement.getId() != 0 && currentElement.getId() == id) //changes!!!!!!
                //person = currentElement;
                return currentElement;
        }
        return null;
    }


    @Override
    public Person findByEmail(String email) {
        if (email == null) throw new IllegalArgumentException("email was null");
        for (Person currentElement : persons) {
            if (currentElement.geteMail().equalsIgnoreCase(email))
                person = currentElement;
        }
        return person;
    }

    @Override
    public Collection<Person> findAll() {
        return persons;
    }

    @Override
    public void remove(int id) {
        persons.removeIf(currentElement -> currentElement.getId() == id);
    }
    }


