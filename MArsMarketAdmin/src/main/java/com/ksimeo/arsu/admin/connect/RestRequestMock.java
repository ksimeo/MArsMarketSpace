package com.ksimeo.arsu.admin.connect;

import com.ksimeo.arsu.core.models.User;

import java.util.List;

/**
 * @author Ksimeo 09.11.2015.
 */

public class RestRequestMock implements IRestRequests {

    public User getUser(String login, String password) {
        return new User();
    }

    public List<User> getUsers() {
        return null;
    }
}