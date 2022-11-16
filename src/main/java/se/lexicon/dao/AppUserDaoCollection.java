////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.dao;


import se.lexicon.AppUser;


import java.util.Collection;


public class AppUserDaoCollection implements AppUserDao {

    private Collection<AppUser> appUsers;
    AppUser appUser = new AppUser();

    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("appUser was null");
        if (appUser.getUserName() != null) throw new IllegalArgumentException("userName was duplicate");
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String userName) {
        if (userName == null) throw new IllegalArgumentException("username was null");
        for (AppUser temp : appUsers ) {
            if(temp.getUserName().equalsIgnoreCase(userName)) appUser=temp;
        }
        return appUser;
    }

    @Override
    public Collection<AppUser> findAll() {
        return appUsers;
    }

    @Override
    public boolean remove(String userName) {
        for (AppUser temp : appUsers ) {
            if(temp.getUserName().equals(userName)) {
                appUsers.remove(temp);
                return true;
            }
        }
        return false;
    }


}
