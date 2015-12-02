package com.ksimeo.arsu.admin.controllers;

import com.ksimeo.arsu.admin.services.IOrderService;
import com.ksimeo.arsu.admin.services.OrderServiceMock;
import com.ksimeo.arsu.core.models.Basket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Ksimeo 05.11.2015.
 */
@WebServlet(urlPatterns = "/main")
public class AdminController extends HttpServlet {
    private IOrderService orderService;

    @Override
    public void init() throws ServletException {
        orderService = new OrderServiceMock();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            List<Basket> orders = orderService.getNewOrders();
            req.setAttribute("orders", orders);
            req.getRequestDispatcher("WEB-INF/admin.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
