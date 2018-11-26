package example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: test
 * @description: Servlet
 * @author: Zhangxike
 * @create: 2018-11-02 16:00
 **/
@WebServlet(urlPatterns = "/xs/myservlet",description = "Servlet说明")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>>>>>>doGet<<<<<<<<<<<<<<<<");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>>>doPst()<<<<<<<<<<<<<<<");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Zhangsnke </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> 测试 myName is Servlet</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
