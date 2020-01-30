package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String fname = req.getParameter("fname");
//        PrintWriter out = resp.getWriter();
//        out.print("Hello" + fname);
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        PrintWriter write = resp.getWriter();
        String htmlResponse = "<html>";
        htmlResponse += "<h2>Hello " + fname + "</h2>";
        htmlResponse += "</html>";
        write.print(htmlResponse);


    }
}
