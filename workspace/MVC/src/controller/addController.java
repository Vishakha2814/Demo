package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.AddNumbers;

@WebServlet("/AddController")
public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public addController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		AddNumbers a = new AddNumbers();
		int addNumbers = a.addNumbers(num1,num2);
		request.setAttribute("result",addNumbers);
		RequestDispatcher rd = request.getRequestDispatcher("AddNumbers.jsp");
		rd.forward(request, response);
	}

}