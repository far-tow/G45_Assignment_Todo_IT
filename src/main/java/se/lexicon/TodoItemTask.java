package se.lexicon;

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

    public TodoItemTask(int id, TodoItem todoItem, Person person) {
        if (todoItem == null) {
            throw new RuntimeException("todoItem is NOT allowed to be NULL!");
        }
        this.id = id;
        this.todoItem = todoItem;
        setAssignee(person);
    }


    // Methods


    // Getters & Setters

    /*public String getSummary(TodoItemTask task) {
        return "IdTask:" + id + " Assigned: " + assigned + " " + assignee.getSummary(assignee);
    }*/


    public int getId() {
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
        return "ToDoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", toDoItem=" + todoItem +
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
