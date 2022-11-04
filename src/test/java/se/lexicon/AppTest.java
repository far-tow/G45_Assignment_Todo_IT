package se.lexicon;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;



public class AppTest {
    public TodoItem item;
    public Person person;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("#-#-# Test Starts here! #-#-#");
    }

    @Test
    public void shouldAnswerWithFalse() {
        assertFalse(false);
        System.out.println("Should be False");
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
        System.out.println("Should be True");
    }


}
