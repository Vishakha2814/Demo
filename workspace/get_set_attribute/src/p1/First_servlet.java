package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/firstServlet")
public class First_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public First_servlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		request.setAttribute("msg", name);
		HttpSession session = request.getSession();
		session.setAttribute("sessionMsg", name);
		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
		rd.forward(request,response);
	}

}
