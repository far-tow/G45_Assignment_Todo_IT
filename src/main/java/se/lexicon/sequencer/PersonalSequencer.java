////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.sequencer;

public class PersonalSequencer {
    //fields
    private static int currentId = 100;

    //constructors


    //methods
    public static int nextId() {
        return ++currentId;
    }


    //getters & setters

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        PersonalSequencer.currentId = currentId;
    }
}
