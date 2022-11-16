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

public class TodoItemTaskDaoCollection implements TodoItemTaskDao {
    Collection<TodoItemTask> tasks;
    TodoItemTask task = new TodoItemTask();


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
        for (TodoItemTask temp : tasks) {
            if (temp.getId() == id)
                task = temp;
        }
        return task;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return tasks;
    }


    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean status) {
        Collection<TodoItemTask> it = new ArrayList<>();
        for (TodoItemTask temp : tasks) {
            if (temp.isAssigned() == status)
                it.add(temp);
        }
        return it;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int id) {
        Collection<TodoItemTask> it = new ArrayList<>();
        for (TodoItemTask temp : tasks) {
            if (temp.getAssignee().getId() == id)
                it.add(temp);
        }
        return it;
    }


    @Override
    public void remove(int id) {
        Iterator<TodoItemTask> itr = tasks.iterator();
        while (itr.hasNext()) {
            TodoItemTask t = itr.next();
            if (id == t.getId()) {
                break;
            }
        }
    }
}
