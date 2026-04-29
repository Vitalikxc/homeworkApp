package org.example.homework_25;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@WebServlet("/load-book")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 10)
public class BookLoader extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        try {
            Part filePart = request.getPart("file");
            String name = filePart.getSubmittedFileName();
            filePart.write("D:\\" + name);
            response.getWriter().print("The file uploaded successfully :)");
        } catch (Exception e) {
            response.getWriter().print("Something wrong :(");
        }
    }
}