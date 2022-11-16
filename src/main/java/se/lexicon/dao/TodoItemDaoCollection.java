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

public class TodoItemDaoCollection implements TodoItemDao {

    private Collection<TodoItem> items;
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
        for (TodoItem temp : items) {
            if (temp.getId() == id)
                item = temp;
        }
        return item;
    }

    @Override
    public Collection<TodoItem> findAll() {

        return items;
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        Collection<TodoItem> it = new ArrayList<>();
        for (TodoItem temp : items) {
            if (temp.isDone() == done)
                it.add(temp);
        }
        return it;
    }


    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        Collection<TodoItem> it = new ArrayList<>();
        for (TodoItem temp : items) {
            if (temp.getTitle().contains(title.toLowerCase()))
                it.add(temp);
        }
        return it;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
        Collection<TodoItem> it = new ArrayList<>();
        for (TodoItem temp : items) {
            if (temp.getCreator().getId() == personId)
                it.add(temp);
        }
        return it;
    }


    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        Collection<TodoItem> it = new ArrayList<>();
        for (TodoItem temp : items) {
            if (temp.getDeadLine().compareTo(date) < 0)
                it.add(temp);
        }
        return it;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        Collection<TodoItem> it = new ArrayList<>();
        for (TodoItem temp : items) {
            if (temp.getDeadLine().compareTo(date) > 0)
                it.add(temp);
        }
        return it;
    }

    @Override
    public void removeId(int id) {
        Iterator<TodoItem> itr = items.iterator();
        while (itr.hasNext()) {
            TodoItem t = itr.next();
            if (id == t.getId()) {
                break;
            }
        }
    }
}
