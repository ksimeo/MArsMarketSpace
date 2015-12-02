package com.ksimeo.arsu.admin.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by @author Ksimeo on 01.12.2015 at 16:24. For project: MArsMarketSpace.
 */
@WebServlet(urlPatterns = "/newproduct.do")
public class NewProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tid = req.getParameter("tid");
        String gid = req.getParameter("gid");
        req.setAttribute("tid", tid);
        req.setAttribute("gid", gid);
        req.getRequestDispatcher("WEB-INF/createprod.jsp").forward(req, resp);
    }
}
