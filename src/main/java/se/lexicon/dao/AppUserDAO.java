////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.dao;

import se.lexicon.App;
import se.lexicon.AppUser;

import java.util.Collection;
import java.util.Collections;

public interface AppUserDAO {
    AppUser persist(AppUser appUser);

    AppUser findByUsername(String userName);

    Collection<AppUser> findAll();

    void remove(String userName);


}
