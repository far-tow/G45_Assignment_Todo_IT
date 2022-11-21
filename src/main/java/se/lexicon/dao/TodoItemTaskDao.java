////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.dao;

import se.lexicon.model.TodoItemTask;

import java.util.Collection;

public interface TodoItemTaskDao {
    TodoItemTask persist (TodoItemTask todoItemTask);
    TodoItemTask findById (int id);
    Collection<TodoItemTask> findAll ();
    Collection<TodoItemTask>findByAssignedStatus(boolean status);
    Collection<TodoItemTask>findByPersonId(int personId);
    void remove (int id);

}
