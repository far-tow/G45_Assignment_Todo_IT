////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static junit.framework.TestCase.assertEquals;





public class PersonTest {
    private Person testPerson;
    private Person testPerson2 = new Person();
    private Person testPerson4 = new Person();

    @Before
    public void beforeTest() {
        testPerson = new Person(123, "Karin", "Persson", "karin@lexicon.se");
        System.out.println(("Before test in PersonTest."));


    }

    @Test
    public void testGetters(){
        assertEquals(123, testPerson.getIdNo());
       assertEquals("Karin", testPerson.getFirstName());
        assertEquals("Persson", testPerson.getLastName());
        assertEquals("karin@lexicon.se", testPerson.geteMail());
    }
    @Test
    public void testSetters(){
        testPerson2.setFirstName("Hans");
        testPerson2.setLastName("Andersson");
        testPerson2.seteMail("hans@lexicon.se");
        System.out.println(testPerson2.toString());
    }
    @Test
    public void testNullExeptions(){
        assertThrows(IllegalArgumentException.class, () -> testPerson4.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> testPerson4.setLastName(null));
        assertThrows(IllegalArgumentException.class, () -> testPerson4.seteMail(null));
    }


    @Test
    public void getSummaryTest(){
        assertEquals("Emp.No:123 Name:Karin Persson Email: karin@lexicon.se", testPerson.getSummary(testPerson));
    }

}
