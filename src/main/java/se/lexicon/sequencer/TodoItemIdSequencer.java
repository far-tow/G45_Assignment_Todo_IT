////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.sequencer;

public class TodoItemIdSequencer {
    //fields
    private static int currentId;




    //constructors





    //methods
    public static int nextId(){
        return ++currentId;
    }




    //getter & setters
    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        TodoItemIdSequencer.currentId = currentId;
    }
}
