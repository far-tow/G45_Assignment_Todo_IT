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





    // Methods
    // TODO: isOverdue() should return true if current date has passed deadLine. if() ?





    // Getters & Setters
    // Done => TODO: title & deadLine NOT ALLOWED TO BE NULL!!!

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) throw new IllegalArgumentException("title is NOT allowed to be NULL!");
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


}
