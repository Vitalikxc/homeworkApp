package org.example.homework_25;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/book")
public class BookDownloader extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String fileName = req.getParameter("filename");
            File bookFile = new File("D:\\" + fileName + ".txt");
            try (FileInputStream in = new FileInputStream(bookFile);
                 OutputStream out = resp.getOutputStream()) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                resp.getWriter().print("The file downloaded successfully :)");
            }
        } catch (Exception e) {
            resp.getWriter().print("Something wrong :(Book");
        }
    }
}
