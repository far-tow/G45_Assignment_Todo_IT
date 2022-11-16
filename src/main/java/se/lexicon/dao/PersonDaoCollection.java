////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.dao;

import se.lexicon.Person;

import java.util.Collection;
import java.util.Iterator;


public class PersonDaoCollection implements PersonDao {
    private Collection<Person> persons;
    Person person = new Person();


    @Override
    public Person persist(Person person) {
        if (person == null) throw new IllegalArgumentException("person was null");
        persons.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        if (id == 0) throw new IllegalArgumentException("id was null");
        for (Person temp : persons) {
            if (temp.getId() == id)
                person = temp;
        }
        return person;
    }


    @Override
    public Person findByEmail(String email) {
        if (email == null) throw new IllegalArgumentException("email was null");
        for (Person temp : persons) {
            if (temp.geteMail().equalsIgnoreCase(email))
                person = temp;
        }
        return person;
    }

    @Override
    public Collection<Person> findAll() {
        return persons;
    }

    @Override
    public void remove(int id) {
        Iterator<Person> itr = persons.iterator();
        while (itr.hasNext()) {
            Person p = itr.next();
            if (id == p.getId()) {
                break;
            }
        }
    }
}
