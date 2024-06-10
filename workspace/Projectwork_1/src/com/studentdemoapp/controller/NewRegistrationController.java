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
@WebServlet("/newReg")
public class NewRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public NewRegistrationController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/webapp/views/newRegistration.jsp");
	rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	String emailid = request.getParameter("emailid");
	String password = request.getParameter("password");
	String city = request.getParameter("city");
	String phone = request.getParameter("phone");
	DataBaseDAO db = new DataBaseDAO();
	Connection con = db.getConnection();
	db.createReg(name, emailid, password, city, phone, con);
	request.setAttribute("msg","Record saved");
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/webapp/views/newRegistration.jsp");
	rd.include(request, response);
	}

}