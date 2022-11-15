////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.dao;

import se.lexicon.Person;

import java.util.Collection;

public interface PersonDAO {
    Person persist(Person person);

    Person findById(int id);

    Person findByEmail(String email);

    Collection<Person> findAll();

    void remove(int id);


}
