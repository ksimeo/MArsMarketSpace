package com.ksimeo.arsu.admin.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by @author Ksimeo on 01.12.2015 at 17:50. For project: MArsMarketSpace.
 */
@WebServlet(urlPatterns = "/newgroup.do")
public class NewGroupController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/newgroup.jsp").forward(req, resp);
    }
}
