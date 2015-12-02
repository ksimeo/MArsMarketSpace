package com.ksimeo.arsu.admin.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by @author Ksimeo on 16.11.2015 at 22:28. For project: MArsMarketSpace.
 */
@WebServlet(urlPatterns = "/createtype.do")
public class CreateTypeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/createtype.jsp").forward(req, resp);
    }
}
