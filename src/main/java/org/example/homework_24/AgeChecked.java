package org.example.homework_24;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/checkage")
public class AgeChecked extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        resp.setContentType("text/html");

        int age = Integer.parseInt(req.getParameter("age"));
        if (age >= 18){
            writer.println("<h1>Adult</h1>");
        } else {
            writer.println("<h1>Minors</h1>");
        }
    }
}
