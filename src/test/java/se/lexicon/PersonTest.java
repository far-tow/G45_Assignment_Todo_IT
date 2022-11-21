////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.lexicon.model.Person;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class PersonTest {
    private Person testPerson;
    private Person testPerson2 = new Person();
    private Person testPerson4 = new Person();

    @BeforeEach
    public void beforeTest() {
        testPerson = new Person("Karin", "Persson", "karin@lexicon.se");


    }

    @Test
    public void testGetters() {
       // assertEquals(102, testPerson.getId());
        assertEquals("Karin", testPerson.getFirstName());
        assertEquals("Persson", testPerson.getLastName());
        assertEquals("karin@lexicon.se", testPerson.geteMail());
    }

    @Test
    public void testSetters() {
        testPerson2.setFirstName("Hans");
        testPerson2.setLastName("Andersson");
        testPerson2.seteMail("hans@lexicon.se");
        System.out.println(testPerson2.toString());
    }

    @Test
    public void testNullExeptions() {
        assertThrows(IllegalArgumentException.class, () -> testPerson4.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> testPerson4.setLastName(null));
        assertThrows(IllegalArgumentException.class, () -> testPerson4.seteMail(null));
    }


    @Test
    public String toString() {
        assertEquals("Name:Karin Persson Email: karin@lexicon.se", testPerson.toString());
        return null;
    }

}
