package se.lexicon;


import com.sun.org.apache.xml.internal.security.keys.storage.StorageResolver;
import se.lexicon.dao.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        AppUserDao storage = new AppUserDaoCollection();
        PersonDao personStorage = new PersonDaoCollection();
        TodoItemDao todoItemStorage = new TodoItemDaoCollection();

        AppUser userData1 = new AppUser("anders", "2352552", AppRole.ROLE_APP_USER);
        AppUser userData2 = new AppUser("karin", "23533352", AppRole.ROLE_APP_ADMIN);
        AppUser userData3 = new AppUser("Hans", "444444", AppRole.ROLE_APP_USER);
        //AppUser presistedAppUser1 = storage.persist(userData1);
        //AppUser persistedAppUser2 = storage.persist(userData2);
        //AppUser presistedAppUser3 = storage.persist(userData3);
        Person personData1 = new Person( "Jörgen","Persson","jorgen.persson@lexicon.se");
        AppUser karin = new AppUser("kari", "Farhad", AppRole.ROLE_APP_ADMIN);
        Person per1 = new Person( "Karin", "Persson", "karin@lexicon.se");
        Person per2 = new Person( "Erik", "Svensson", "erik@lexicon.se");

        System.out.println(per1.toString());
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
        System.out.println(userData2);


    }
    }
