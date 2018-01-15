package com.yai.hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Login extends HttpServlet {
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
 
        writer.println("" + "" + "<center>"
                + "Details Added Successfully" + "</center>" + ""
                + "");
    }
}
