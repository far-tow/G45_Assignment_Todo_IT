////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon;

public enum AppRole {
    ROLE_APP_USER {
        public String toString() {
            return "*USER*";
        }
    },
    ROLE_APP_ADMIN {
        public String toString() {
            return "*ADMINISTRATOR*";
        }
    };
}
