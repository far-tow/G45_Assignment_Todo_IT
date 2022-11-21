////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.dao;

import se.lexicon.model.AppUser;

import java.util.Collection;

public interface AppUserDao {
    AppUser persist(AppUser appUser);

    AppUser findByUsername(String userName);

    Collection<AppUser> findAll();

    boolean remove(String userName);



}
