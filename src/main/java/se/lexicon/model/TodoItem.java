////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.model;

import se.lexicon.sequencer.TodoItemIdSequencer;

import java.time.LocalDate;
import java.util.Objects;


public class TodoItem {
    // Fields
    private int id;
    public String title;
    public String taskDescription;
    public LocalDate deadLine;
    public boolean done;
    public Person creator;


    // Constructors

    public TodoItem() {

    }

    public TodoItem(String title, String taskDescription, LocalDate deadLine, boolean done, Person creator) {
        if (title == null || title.isEmpty()) throw new RuntimeException("title is NOT allowed to be NULL!");
        this.id = TodoItemIdSequencer.nextId();
        this.title = title;
        this.taskDescription = taskDescription;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }


    // Methods
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
    /*public String getSummary(TodoItem task) {
        return "IdToDo:" + getId() + " Title:" + getTitle() + " Task:" + getTaskDescription() + " Deadline:" + getDeadLine() + " Done:" + isDone() + " " + creator.getSummary(creator);
    }*/


    public int getId() {
        TodoItemIdSequencer.nextId();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodoItem)) return false;
        TodoItem todoItem = (TodoItem) o;
        return getId() == todoItem.getId() && isDone() == todoItem.isDone() && getTitle().equals(todoItem.getTitle()) && getTaskDescription().equals(todoItem.getTaskDescription()) && getDeadLine().equals(todoItem.getDeadLine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getTaskDescription(), getDeadLine(), isDone());
    }
    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                '}';
    }



}
