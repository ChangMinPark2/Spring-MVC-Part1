package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * http://localhost:8080//requestParam?username=hello&age=20
 */
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("전체 파라이터 조회 - start");
        req.getParameterNames()
                .asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName + " = " + req.getParameter(paramName)));
        System.out.println("전체 파라이터 조회 - end");

        System.out.println("파라미터 1");
        String userName = req.getParameter("username");
        System.out.println("userName = " + userName);

    }


}
