////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TodoItemTaskTest {

    Person testPerson = new Person("Kristina", "Hansson", "kristina@lexicon.se");
    TodoItem testItem = new TodoItem("Saw veneer", "Make veneers to size", LocalDate.parse("2022-11-30"),
            false, testPerson);
    private TodoItemTask testTask = new TodoItemTask(testItem, testPerson);
    private TodoItemTask testTask2 = new TodoItemTask(testItem, testPerson);
    private TodoItemTask testTask3 = new TodoItemTask();

    @BeforeEach
    public void beforeTest() {
        //System.out.println("#-#-# Test Starts here! #-#-#");
    }

    @Test
    public void testGetters() {
        //assertEquals(111, testTask.getId());
        assertTrue(testTask.isAssigned());
        assertTrue(testTask2.isAssigned());
    }

    @Test
    public void testSetters() {
       // testTask3.setId(89);
        testTask3.setAssigned(true);
        testTask3.setTodoItem(testItem);
        testTask3.setAssignee(testPerson);
        System.out.println(testTask3.toString());
    }

    @Test
    public void testNullExeptions() {
        assertThrows(IllegalArgumentException.class, () -> testTask3.setTodoItem(null));
    }

    @Test
    public String toString() {
        assertEquals("Assigned: true Emp.No:67 Name:Kristina Hansson Email: kristina@lexicon.se", testTask.toString());
        return null;
    }

}
