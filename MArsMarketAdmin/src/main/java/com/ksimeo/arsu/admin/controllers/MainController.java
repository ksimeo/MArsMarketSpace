package com.ksimeo.arsu.admin.controllers;

import com.ksimeo.arsu.admin.services.IOrderService;
import com.ksimeo.arsu.admin.services.OrderServiceMock;
import com.ksimeo.arsu.core.models.Basket;
import com.ksimeo.arsu.core.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Ksimeo 14.11.2015/15:15. Project: MArsMarketSpace.
 */
@WebServlet(urlPatterns = "/main.do")
public class MainController extends HttpServlet {
    private IOrderService orderService;

    @Override
    public void init() throws ServletException {
        orderService = new OrderServiceMock();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Basket> orders = orderService.getNewOrders();
            User currUsr = (User)req.getSession().getAttribute("user");
            req.setAttribute("username", currUsr.getName());
            req.setAttribute("orders", orders);
            req.getRequestDispatcher("WEB-INF/admin.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}