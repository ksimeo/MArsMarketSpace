package com.ksimeo.arsu.admin.controllers;

import com.ksimeo.arsu.admin.services.IUserService;
import com.ksimeo.arsu.admin.services.UserServiceMock;
import com.ksimeo.arsu.core.models.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by @author Ksimeo on 01.12.2015 at 12:56. For project: MArsMarketSpace.
 */
public class UserEditController extends HttpServlet {
    private IUserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserServiceMock();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users = userService.getUsers();
    }
}