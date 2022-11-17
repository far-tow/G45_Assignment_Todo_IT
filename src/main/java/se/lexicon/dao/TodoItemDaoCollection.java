////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.dao;

import se.lexicon.Person;
import se.lexicon.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TodoItemDaoCollection implements TodoItemDao {

    private List<TodoItem> items = new ArrayList<>();
    TodoItem item = new TodoItem();


    @Override
    public TodoItem persist(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("todoItem was null");
        TodoItem result = findById(todoItem.getId());
        if (result != null) throw new IllegalArgumentException("id was duplicate");
        items.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        if (id == 0) throw new IllegalArgumentException("id was null");
        for (TodoItem currentElement : items) {
            if (currentElement.getId() != 0 && currentElement.getId() == id)
                 return currentElement;
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {

        return items;
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        Collection<TodoItem> it = new ArrayList<>();
        for (TodoItem currentElement : items) {
            if (currentElement.isDone() == done)
                it.add(currentElement);
        }
        return it;
    }


    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        Collection<TodoItem> it = new ArrayList<>();
        for (TodoItem currentElement : items) {
            if (currentElement.getTitle().contains(title.toLowerCase()))
                it.add(currentElement);
        }
        return it;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
        Collection<TodoItem> it = new ArrayList<>();
        for (TodoItem currentElement : items) {
            if (currentElement.getCreator().getId() == personId)
                it.add(currentElement);
        }
        return it;
    }


    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        Collection<TodoItem> it = new ArrayList<>();
        for (TodoItem currentElement : items) {
            if (currentElement.getDeadLine().compareTo(date) < 0)
                it.add(currentElement);
        }
        return it;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        Collection<TodoItem> it = new ArrayList<>();
        for (TodoItem currentElement : items) {
            if (currentElement.getDeadLine().compareTo(date) > 0)
                it.add(currentElement);
        }
        return it;
    }

    @Override
    public void removeId(int id) {
        items.removeIf(currentElement -> currentElement.getId() == id);
    }
}
