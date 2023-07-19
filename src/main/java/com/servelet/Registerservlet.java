package com.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
public class Registerservlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		String name = req.getParameter("name");
        String contact = req.getParameter("contact");
        String gender = req.getParameter("gender");
        String dobString = req.getParameter("dob");
        String address = req.getParameter("address");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
	}

}
