////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.model;

import se.lexicon.sequencer.TodoItemIdSequencer;

import java.util.Objects;

public class TodoItemTask {
    // Fields
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;


    // Constructors
    public TodoItemTask() {

    }

    public TodoItemTask(TodoItem todoItem, Person person) {
        if (todoItem == null) {
            throw new RuntimeException("todoItem is NOT allowed to be NULL!");
        }
        this.id = TodoItemIdSequencer.nextId();
        this.todoItem = todoItem;
        setAssignee(person);
    }


    // Methods


    // Getters & Setters

    /*public String getSummary(TodoItemTask task) {
        return "IdTask:" + id + " Assigned: " + assigned + " " + assignee.getSummary(assignee);
    }*/


    public int getId() {
        TodoItemIdSequencer.nextId();
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("todo is NOT allowed to be NULL!");
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        this.assigned = true;
    }

    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TodoItemTask)) return false;
        TodoItemTask that = (TodoItemTask) o;
        return getId() == that.getId() && isAssigned() == that.isAssigned() && getTodoItem().equals(that.getTodoItem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), isAssigned(), getTodoItem());
    }
}
