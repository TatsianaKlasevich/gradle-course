package com.klasevich.servlet;

import com.klasevich.service.UserService;

@WebServlet("/users")
public class UserServlet extends HttpServlet{
    private final UserService userService = new UserService();

}

