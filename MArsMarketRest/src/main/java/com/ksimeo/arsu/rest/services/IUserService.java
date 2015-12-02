package com.ksimeo.arsu.rest.services;

import com.ksimeo.arsu.core.models.User;

import java.util.List;

/**
 * @author Ksimeo 09.11.2015.
 */
public interface IUserService {
    User getUser(String login, String password);
    List<User> getUsers();
}
