////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import java.time.LocalDate;

public class TodoItemTest {
    private TodoItem testItem;
    private TodoItem testItem2;
    private TodoItem testItem3 = new TodoItem();
    private Person person = new Person("Hans", "Andersson", "hans@lexicon.se");


    @BeforeEach
    public void beforeTest() {
        testItem = new TodoItem("Clean workshop","Workshop", LocalDate.parse("2022-11-30"),false, person);
        testItem2 = new TodoItem("Oil in tools","Toolsection", LocalDate.parse("2022-10-15"),true, person);
        System.out.println("#-#-# Test Starts here! #-#-#");
    }

    @Test
    public void testGetters(){
        //assertEquals(123, testItem.getId());
        assertEquals("Clean workshop", testItem.getTitle());
        assertEquals("Workshop", testItem.getTaskDescription());
        assertEquals(LocalDate.parse("2022-11-30"), testItem.getDeadLine());
        assertFalse(testItem.isDone());
        assertTrue(testItem2.isDone());
    }

    @Test
    public void testSetters(){
        testItem3.setId(13);
        testItem3.setTitle("Cleaning");
        testItem3.setTaskDescription("Workshop");
        testItem3.setDeadLine(LocalDate.parse("2022-11-30"));
        testItem3.setDone(false);
        testItem3.setCreator(person);
        System.out.println(testItem3.toString());
    }

    @Test
    public void testNullExeptions(){
        assertThrows(IllegalArgumentException.class, ()-> testItem3.setTitle(null));
        assertThrows(IllegalArgumentException.class, ()-> testItem3.setDeadLine(null));
    }

    @Test
    public void isOverDue_should_return_false() {
        assertFalse(testItem.isOverDue(testItem));
    }

    @Test
    public void isOverDue_should_return_true() {
        assertTrue(testItem2.isOverDue(testItem2));
    }


}
