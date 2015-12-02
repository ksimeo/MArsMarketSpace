package com.ksimeo.arsu.admin.connect;

import com.ksimeo.arsu.core.models.User;

import java.util.List;

/**
 * @author Ksimeo 09.11.2015.
 */
public interface IRestRequests {

    User getUser(String login, String password);
    List<User> getUsers();
}
