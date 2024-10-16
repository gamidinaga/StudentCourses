package org.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        if (user == null || user.trim().isEmpty()) {
            user = "Guest";
        }
        response.setContentType("text/html");
        String message = "Hello, " + user + "! Welcome to Student_App.";
        // Set attributes to be accessed in JSP
        request.setAttribute("message", message);
        // Forward the request to template/hello.jsp
        request.getRequestDispatcher("WEB-INF/templates/hello.jsp").forward(request, response);
    }
}
