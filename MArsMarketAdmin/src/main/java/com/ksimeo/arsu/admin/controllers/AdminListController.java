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
 * Created by @Ksimeo on 15.11.2015 at 17:11. For project MArsMarketSpace.
 */
@WebServlet(urlPatterns = "/seehistory.do")
public class AdminListController extends HttpServlet {

    private IOrderService orderService = new OrderServiceMock();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int page = Integer.parseInt(req.getParameter("p"));
            req.setAttribute("currpage", page);
//            System.out.println(p);
////            Integer page = Integer.getInteger(p);
//            int page = Integer.parseInt(p);
//            int page = Integer.getInteger(req.getParameter("p"));
//            int from = (page - 1) * 5 + 1;
//            int to = (page - 1) * 5 + 5;
            List<Basket> baskets = orderService.getOrderPage(page);
            req.setAttribute("orders", baskets);
            req.getRequestDispatcher("WEB-INF/adminslist.jsp").forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
