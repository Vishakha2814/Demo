package com.studentdemoapp.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentdemoapp.model.DataBaseDAO;
@WebServlet("/verifylogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		DataBaseDAO db = new DataBaseDAO();
		Connection con = db.getConnection();
		boolean loginResult = db.verifyLoginCredentials(emailid,password,con);
		if (loginResult==true) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/webapp/views/newRegistration.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("error","Username / Password invalid");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	}

}
