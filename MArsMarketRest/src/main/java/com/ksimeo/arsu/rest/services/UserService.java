package com.ksimeo.arsu.rest.services;

import com.ksimeo.arsu.core.models.User;
import com.ksimeo.arsu.rest.dao.IUserDao;
import com.ksimeo.arsu.rest.helpers.EncryptHelper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Ksimeo 09.11.2015.
 */
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    public User getUser(String login, String password) {
        try {
            Iterable<User> users = userDao.findAll();
            for (User user : users) {
                if (user.getLogin().equals(login)) {
                    String encryptPassw = EncryptHelper.String2Hash(password);
                    if (user.getPassword().equals(encryptPassw)) return user;
                    else return null;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<User> getUsers() {
        try {
            return (List<User>) userDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}