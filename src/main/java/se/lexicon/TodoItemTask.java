package se.lexicon;

public class TodoItemTask {
    // Fields
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;


    // Constructors
    //TODO: Create constructors as needed
    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person person) {
        if (todoItem == null) {
            throw new RuntimeException("todoItem is NOT allowed to be NULL!");
        }
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = person;
    }


    // Methods


    // Getters & Setters

    public String getSummary(TodoItemTask task) {
        return "IdTask:" + id + " Assigned: " + assigned + " " + assignee.getSummary(assignee);
    }


    public int getId() {
        return id;
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
    }

}
