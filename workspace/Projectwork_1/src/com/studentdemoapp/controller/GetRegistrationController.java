package com.studentdemoapp.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentdemoapp.model.DataBaseDAO;
@WebServlet("/getReg")
public class GetRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetRegistrationController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBaseDAO dao = new DataBaseDAO();
		Connection con = dao.getConnection();
		ResultSet results= dao.getAllReg(con);
		request.setAttribute("res", results);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/webapp/views/getReg.jsp");
		rd.forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
 
}
