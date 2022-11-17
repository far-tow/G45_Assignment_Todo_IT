////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.dao;


import se.lexicon.AppUser;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class AppUserDaoCollection implements AppUserDao {

    //private List<AppUser> appUsers;
    private List<AppUser> appUsers;
    public AppUserDaoCollection() {
        this.appUsers = new ArrayList<>();
    }

    @Override
    public AppUser persist(AppUser appUser) {
        if (appUser == null) throw new IllegalArgumentException("appUser was null");
        AppUser result = findByUsername(appUser.getUserName());
        if (result != null) throw new IllegalArgumentException("userName was duplicate");
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    public AppUser findByUsername(String userName) {
        if (userName == null) throw new IllegalArgumentException("username was null");
        for (AppUser temp : appUsers ) {
            if (!(temp.getUserName().equals(null)) && temp.getUserName().equalsIgnoreCase(userName))

                return temp;
            //appUsers.add(temp);
        }
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return new ArrayList<>(appUsers);
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
