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
@WebServlet("/deleteStudent")
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteStudentController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		System.out.println(emailid);
		DataBaseDAO dao = new DataBaseDAO();
		Connection con = dao.getConnection();
		dao.deleteStudentByEmailid(emailid,con);
		ResultSet results = dao.getAllReg(con);
		request.setAttribute("res", results);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/webapp/views/getReg.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
