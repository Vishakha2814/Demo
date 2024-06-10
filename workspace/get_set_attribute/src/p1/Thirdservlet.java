package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Thirdservlet")
public class Thirdservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Thirdservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = (String)request.getAttribute("name");
	PrintWriter out = response.getWriter();
	out.print(name);

	HttpSession session = request.getSession();
	out.println(session.getAttribute("sessionMsg"));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
