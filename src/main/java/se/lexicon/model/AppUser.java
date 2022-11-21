////////////////////////////////////////////////////////////////////////////////
// Copyright (c) Farhad Towfighian 2022.                                       /
// https://github.com/far-tow                                                  /
////////////////////////////////////////////////////////////////////////////////

package se.lexicon.model;

import java.util.Objects;

//fields
public class AppUser {
    private String userName;
    private String passWord;
    private AppRole role;

    //Constructors

    public AppUser(String userName, String passWord, AppRole role) {
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
    }

    public AppUser() {

    }


    //Methods

    @Override
    public String toString() {
        return "AppUser{" + "userName='" + userName + '\'' + ", role=" + role + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return userName.equals(appUser.userName) && Objects.equals(passWord, appUser.passWord) && role.equals(appUser.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, role);
    }
    //Getters & Setters


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == null || userName.isEmpty())
            throw new IllegalArgumentException("Username is NOT allowed to be NULL or Empty!");
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        if (passWord == null || passWord.isEmpty())
            throw new IllegalArgumentException("Password is NOT allowed to be NULL or Empty!");
        this.passWord = passWord;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) throw new IllegalArgumentException("Password is NOT allowed to be NULL!");
        this.role = role;
    }
}
