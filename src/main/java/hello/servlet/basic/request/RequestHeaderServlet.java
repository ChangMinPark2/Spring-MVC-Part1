package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("-------");
        System.out.println("rMethod" + request.getMethod());
        System.out.println("rProtocol" + request.getProtocol());
        System.out.println("rScheme" + request.getScheme());
        System.out.println("rURI" + request.getRequestURL());
        System.out.println();

    }
}
