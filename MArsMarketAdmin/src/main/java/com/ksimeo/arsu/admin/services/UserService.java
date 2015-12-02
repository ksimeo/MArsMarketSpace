package com.ksimeo.arsu.admin.services;

import com.ksimeo.arsu.admin.connect.IRestRequests;
import com.ksimeo.arsu.admin.connect.RestRequest;
import com.ksimeo.arsu.core.models.User;

import java.util.List;

/**
 * @author Ksimeo 05.11.2015.
 */
public class UserService implements IUserService {

    private IRestRequests restRequests;

    public UserService() {
        this.restRequests = new RestRequest();
    }

    public User getUser(String login, String password) {
        return restRequests.getUser(login, password);
    }

    public List<User> getUsers() {
        return restRequests.getUsers();
    }

    public boolean isPasswCorrect(String passw) {
        return false;
    }

    public void setNewPassw(String passw) {

    }

    public void addUser(User newUser) {

    }

    public void delUser(int id) {

    }
}