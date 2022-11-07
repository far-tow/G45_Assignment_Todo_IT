package se.lexicon;

import java.time.LocalDate;


public class TodoItem {
    // Fields
    private int id;
    public String title;
    public String taskDescription;
    public LocalDate deadLine;
    public boolean done;
    public Person creator;


    // Constructors
    //TODO: Create constructors as needed
    public TodoItem (){

    }
    public TodoItem(int id, String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        if(title == null || title.isEmpty()) throw new RuntimeException("title is NOT allowed to be NULL!");
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }


    // Methods
    // Done => TODO: isOverdue() should return true if current date has passed deadLine. if() ?
    public boolean isOverDue(TodoItem task) {
        /*LocalDate currentDate = LocalDate.now();
        int result = deadLine.compareTo(currentDate);
        if (result < 0) ;
        {
            return true;
        }*/
        LocalDate dateToDay = LocalDate.now();
        int result = deadLine.compareTo(dateToDay);
        return result < 0;
    }


    // Getters & Setters
    // Done => TODO: title & deadLine NOT ALLOWED TO BE NULL!!!
    public String getSummary(TodoItem task) {
        return "IdToDo:" + getId() + " Title:" + getTitle() + " Task:" + getTaskDescription() + " Deadline:" + getDeadLine() + " Done:" + isDone() + " " + creator.getSummary(creator);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("title is NOT allowed to be NULL or EMPTY!");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null) throw new IllegalArgumentException("deadLine is NOT allowed to be NULL!");
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    //TODO: Create todoItemInformation


}
