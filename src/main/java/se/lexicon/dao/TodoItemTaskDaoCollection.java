////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.dao;

import se.lexicon.TodoItem;
import se.lexicon.TodoItemTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TodoItemTaskDaoCollection implements TodoItemTaskDao {
    Collection<TodoItemTask> tasks = new ArrayList<>();

    public TodoItemTaskDaoCollection() {
    }

    @Override
    public TodoItemTask persist(TodoItemTask task) {
        if (task == null) throw new IllegalArgumentException("task was null");
        TodoItemTask result = findById(task.getId());
        if (result != null) throw new IllegalArgumentException("task was duplicate");
        tasks.add(task);
        return task;
    }

    @Override
    public TodoItemTask findById(int id) {
        if (id == 0) throw new IllegalArgumentException("id was null");
        for (TodoItemTask currentElement : tasks) {
            if (currentElement.getId() != 0 && currentElement.getId() == id)
                return currentElement;
        }
        return null;
    }


    @Override
    public Collection<TodoItemTask> findAll() {
        return new ArrayList<>(tasks);
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean status) {
        Collection<TodoItemTask> it = new ArrayList<>();
        for (TodoItemTask currentElement : tasks) {
            if (currentElement.isAssigned() == status)
                it.add(currentElement);
        }
        return it;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int id) {
        List<TodoItemTask> it = new ArrayList<>();
        for (TodoItemTask currentElement : tasks) {
            if (currentElement.getAssignee().getId() == id)
                it.add(currentElement);
            return it;
        }
        return it;
    }


    @Override
    public void remove(int id) {
        //tasks.removeIf(currentElement -> currentElement.getId() == id);
        Iterator<TodoItemTask> it = tasks.iterator();
        while (it.hasNext()) {
            TodoItemTask currentElement = it.next();
            if (currentElement.getId() == id) {
                it.remove();
                break;
            }
        }


    }
}
