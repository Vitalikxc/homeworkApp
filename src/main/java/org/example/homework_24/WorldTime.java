package org.example.homework_24;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class WorldTime extends HttpServlet {

    ZonedDateTime washingtonTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
    ZonedDateTime beijingTime = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        switch (req.getServletPath()) {
            case "/washington":
                writer.println(washingtonTime);
                break;
            case "/beijing":
                writer.println(beijingTime);
                break;
        }
    }
}
