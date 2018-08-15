package user.web.servlet;

import user.domain.User;
import user.service.UserException;
import user.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        UserService userService = new UserService();
        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        try {
            userService.register(user);
            response.getWriter().print("<h1>注册成功</h1> <br> <a href='" + request.getContextPath() + "/user/login.jsp'>点击登录</a>'");
        } catch (UserException e) {
            request.setAttribute("msg", e.getMessage());
            request.getRequestDispatcher("/user/regist.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
