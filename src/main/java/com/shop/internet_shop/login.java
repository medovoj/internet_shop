package com.shop.internet_shop;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login", value = "/login")
public class login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = "1234";
        String password = "1234";
        String login1 = request.getParameter("login");
            String password1 = request.getParameter("password");
            if(login.equals(login1) && password.equals(password1)) {
                response.sendRedirect("/my-private-page"); }
            else {
                response.sendRedirect("/nea");
            }
    }

}
