package se.lexicon;


import com.sun.org.apache.xml.internal.security.keys.storage.StorageResolver;
import se.lexicon.dao.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class App {
    public static void main(String[] args) {
        AppUserDao appUserStorage = new AppUserDaoCollection();
        PersonDao persons = new PersonDaoCollection();
        TodoItemDao items = new TodoItemDaoCollection();
        TodoItemTaskDao tasks = new TodoItemTaskDaoCollection();

        AppUser userData1 = new AppUser("anders", "2352552", AppRole.ROLE_APP_USER);
        AppUser userData2 = new AppUser("karin", "23533352", AppRole.ROLE_APP_ADMIN);
        AppUser userData3 = new AppUser("Hans", "444444", AppRole.ROLE_APP_USER);

        AppUser createdAppUser1 = appUserStorage.persist(userData1);
        AppUser createdAppUser2 = appUserStorage.persist(userData2);
        AppUser createdAppUser3 = appUserStorage.persist(userData3);


        System.out.println("****Find All Appusers **** \n" + appUserStorage.findAll());
        System.out.println("****Find by Username **** \n" + appUserStorage.findByUsername("anders"));
        //appUsers.remove("anders");

        System.out.println("****Check if anders is removed **** \n" + appUserStorage.findAll());

        /*AppUser persistedAppUser2 = appUsers.persist(userData2);
        //AppUser presistedAppUser3 = appUsers.persist(userData3);
        Person personData1 = new Person( "Jörgen","Persson","jorgen.persson@lexicon.se");
        AppUser karin = new AppUser("kari", "Farhad", AppRole.ROLE_APP_ADMIN);*/
        Person per1 = new Person("Karin", "Persson", "karin@lexicon.se", createdAppUser1);
        Person per2 = new Person("Erik", "Svensson", "erik@lexicon.se", createdAppUser2);
        Person per3 = new Person("Göran", "Samuelsson", "goran@lexicon.se", createdAppUser3);
        System.out.println("****Show the id of pers2 here **** \n" + per2.getId());
        Person createdPerson1 = persons.persist(per1);
        Person createdPerson2 = persons.persist(per2);
        Person createdPerson3 = persons.persist(per3);
        System.out.println("****Find All Person **** \n" + persons.findAll());
        System.out.println("****Find by id **** \n" + persons.findById(createdPerson1.getId()));
        System.out.println("****Find by email **** \n" +persons.findByEmail("erik@lexicon.se"));
        persons.remove(103);
        System.out.println("****Show if person 103 is removed **** \n" + persons.findAll());

        TodoItem item1 = new TodoItem("Cut to size", "Cut the legs to 10 inch", LocalDate.parse("2022-11-01"), false, createdPerson1);
        TodoItem item2 = new TodoItem("Glue up", "Glue Oak tableTops", LocalDate.parse("2022-12-31"), false, createdPerson2);
        TodoItem item3 = new TodoItem("blabla", "göra nåt", LocalDate.parse("2022-11-24"), false,createdPerson3);
        TodoItem createdItem1 = items.persist(item1);
        TodoItem createdItem2 = items.persist(item2);
        TodoItem createdItem3 = items.persist(item3);
        TodoItemTask task1 = new TodoItemTask(createdItem1, createdPerson1);
        TodoItemTask task2 = new TodoItemTask(createdItem2, createdPerson2);
        //TodoItemTask task3 = new TodoItemTask(createdItem3,createdPerson3);
        System.out.println("_________________________________");
        TodoItemTask createdTask1 = tasks.persist(task1);
        TodoItemTask createdTask2 = tasks.persist(task2);
        System.out.println(items.findById(201));
        //System.out.println(item1);
        System.out.println(tasks.findAll());
        System.out.println(items.findAll());




        /*System.out.println(per1.toString());
        System.out.println(per2.toString());
        System.out.println("___________________________________");

        //Create Tasks and assigns it to assignees
        TodoItem item1 = new TodoItem("Cut to size", "Cut the legs to 10 inch", LocalDate.parse("2022-11-01"), false, per1);
        TodoItem item2 = new TodoItem("Glue up", "Glue Oak tableTops", LocalDate.parse("2022-12-31"), false, per2);
        TodoItem item3 = new TodoItem("blabla", "göra nåt", LocalDate.parse("2022-11-24"), false, per1);


        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println(item3.toString());
        System.out.println("___________________________________");

        //Check when task should be done and if the date has passed or not.
        boolean overDue = item1.isOverDue(item1);
        System.out.println(item1.getTitle() + " " + overDue);
        overDue = item2.isOverDue(item2);
        System.out.println(item2.getTitle() + " " + overDue);
        System.out.println("___________________________________");

        TodoItemTask task1 = new TodoItemTask(item1, per1);
        TodoItemTask task2 = new TodoItemTask(item2, per2);

        System.out.println(task1.toString());
        System.out.println(task2.toString());
        System.out.println("___________________________________");

        System.out.println("item1 hashcode = " + item1.hashCode());
        System.out.println("item2 hashcode = " + item2.hashCode());
        System.out.println("Checking equality between item1 and item2 = " + item1.equals(item2));
        System.out.println("___________________________________");

        System.out.println(userData1);
        System.out.println(userData2);
        userData2.setUserName("Åsa");
        System.out.println(userData2);*/
        //System.out.println(userData1);


    }
}
