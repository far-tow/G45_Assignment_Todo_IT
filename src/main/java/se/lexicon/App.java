package se.lexicon;


import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Person per1 = new Person(1, "Karin", "Persson", "karin@lexicon.se");
        Person per2 = new Person(2, "Erik", "Svensson", "erik@lexicon.se");

        System.out.println(per1.getSummary(per1));
        System.out.println(per2.getSummary(per2));
        System.out.println("___________________________________");

        TodoItem item1 = new TodoItem(10, "Cut to size", "Cut the legs to 10 inch", LocalDate.parse("2022-11-01"), false, per1);
        TodoItem item2 = new TodoItem(11, "Glue up", "Glue Oak tableTops", LocalDate.parse("2022-12-31"), false, per2);

        System.out.println(item1.getSummary(item1));
        System.out.println(item2.getSummary(item1));
        System.out.println("___________________________________");

        boolean overDue = item1.isOverDue(item1);
        System.out.println(item1.getTitle() + " " + overDue);
        System.out.println("___________________________________");

        overDue = item2.isOverDue(item2);
        System.out.println(item2.getTitle() + " " + overDue);
        System.out.println("___________________________________");

        TodoItemTask task1 = new TodoItemTask(20, true, item1, per1);
        TodoItemTask task2 = new TodoItemTask(21, true, item2, per2);
        System.out.println(task1.getSummary(task1));
        System.out.println(task2.getSummary(task2));
        System.out.println("___________________________________");
    }
}
