package com.ksimeo.arsu.admin.controllers;

import com.ksimeo.arsu.admin.services.IUserService;
import com.ksimeo.arsu.admin.services.UserServiceMock;
import com.ksimeo.arsu.core.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author Ksimeo 05.11.2015.
 */
@WebServlet(urlPatterns = "/login")
public class LogInController extends HttpServlet {
    //    @Autowired
    private IUserService userService = new UserServiceMock();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
            String login = req.getParameter("login");
            String password = req.getParameter("password");
            System.out.println("login: " + login);
            System.out.println("password: " + password);
//            if (null != login && !(login.isEmpty()) && null != password && !(password.isEmpty())) {
                User visitor = userService.getUser(login, password);
                if (visitor != null) {
                    HttpSession session = req.getSession();
                    session.setAttribute("user", visitor);
                    session.setMaxInactiveInterval(30*60);
                    Cookie userLogin = new Cookie("user", login);
                    userLogin.setMaxAge(30*60);
                    resp.addCookie(userLogin);
                    req.setAttribute("Error","");
                    if (visitor.isAdmin())
                    resp.sendRedirect("/main.do");
                    else resp.sendRedirect("/usermain.do");
                } else {
                    req.setAttribute("Error", "Вы ввели неверный логин или(и) пароль!");
                    req.setAttribute("login", login);
                    req.setAttribute("password", password);
                    req.getRequestDispatcher("/index.jsp").forward(req, resp);
                }
//            } else req.setAttribute("Error", "Вы не заполнили все поля!");
//            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}