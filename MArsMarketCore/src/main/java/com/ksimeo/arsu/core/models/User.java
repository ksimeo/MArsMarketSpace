package com.ksimeo.arsu.core.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Ksimeo 05.11.2015.
 */
@Entity(name="users")
public class User {
    @Id
    @Column
    @GeneratedValue
    private int id;
    @Column
    private String login;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String password;
    @Column
    private boolean isAdmin;

    public User() { }

    public User(String login, String password, String name, String surname, boolean isAdmin) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.isAdmin = isAdmin;
    }

    public User(int id, String login, String password, String name, String surname, boolean isAdmin) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.isAdmin = isAdmin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}