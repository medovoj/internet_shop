package com.shop.internet_shop;

import WebUtils.SessionUtils;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CartItem;
import model.ShoppingCart;

import java.io.IOException;
import java.util.Random;

@WebServlet("/current-cart")
public class ShoppingCartServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cmd = req.getParameter("cmd");
        if ("clear".equals(cmd)) {
            SessionUtils.clearCurrentShoppingCart(req, resp);
        } else if ("invalidate".equals(cmd)) {
            req.getSession().invalidate();
        } else if ("add".equals(cmd)) {
            addProduct(req, resp);
        }
        showShoppingCart(req, resp);
    }

    protected void showShoppingCart(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/shopping-cart.jsp").forward(req, resp);
    }

    protected void addProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShoppingCart shoppingCart = SessionUtils.getCurrentShoppingCart(req);
        Random r = new Random();
        shoppingCart.addProduct(r.nextInt(2), r.nextInt(1) + 1);
    }


    protected String shoppingCartToString(ShoppingCart shoppingCart) {
        StringBuilder res = new StringBuilder();
        for (CartItem cartItem : shoppingCart.getItems()) {
            res.append(cartItem.getIdProduct()).append("-").append(cartItem.getCount()).append("|");
        }
        if (res.length() > 0) {
            res.deleteCharAt(res.length() - 1);
        }
        return res.toString();
    }

    }

