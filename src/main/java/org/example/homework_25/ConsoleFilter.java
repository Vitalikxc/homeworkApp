package org.example.homework_25;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter(urlPatterns = "/*", filterName = "ConsoleFilter")
public class ConsoleFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(LocalDateTime.now() + " Date ");

        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Server is running");
    }

    @Override
    public void destroy() {
        System.out.println("The server has shut down");
    }
}
