package com.shop.internet_shop;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/params")
public class Servlet_param extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String param1 = req.getParameter("param1");
        Integer param2 = Integer.parseInt(req.getParameter("param2"));
        boolean param3 = Boolean.parseBoolean(req.getParameter("param3"));
        String[] param4 = req.getParameterValues("param4");

        System.out.println();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
