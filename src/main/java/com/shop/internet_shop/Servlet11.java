package com.shop.internet_shop;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Model;

import java.io.IOException;

@WebServlet( "/servlet11")
public class Servlet11 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("model", new Model());
        req.getRequestDispatcher("/WEB-INF/model.jsp").forward(req, resp);
    }
}