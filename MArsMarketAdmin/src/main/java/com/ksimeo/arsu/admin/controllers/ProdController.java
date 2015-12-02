package com.ksimeo.arsu.admin.controllers;

import com.ksimeo.arsu.admin.services.*;
import com.ksimeo.arsu.core.models.ProdGroup;
import com.ksimeo.arsu.core.models.ProdType;
import com.ksimeo.arsu.core.models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by @author Ksimeo on 17.11.2015 at 15:43. For project: MArsMarketSpace.
 */
@WebServlet(urlPatterns = "/prodedit.do")
public class ProdController extends HttpServlet {

    ITypeService typeService = new TypeServiceMock();
    IGroupService groupService = new GroupServiceMock();
    IProdService prodService = new ProdServiceMock();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int tid = Integer.parseInt(req.getParameter("tid"));
        int gid = Integer.parseInt(req.getParameter("gid"));
        List<ProdType> types = typeService.getAllTypes();
        List<ProdGroup> groups = groupService.getGroups(tid);
        List<Product> products = prodService.getProducts(gid);
        req.setAttribute("types", types);
        req.setAttribute("groups", groups);
        req.setAttribute("products", products);
        req.getRequestDispatcher("WEB-INF/products.jsp").forward(req, resp);
    }
}