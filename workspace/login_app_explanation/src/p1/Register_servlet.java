package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Register_servlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		String city = request.getParameter("city");
		String phone = request.getParameter("phone");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject_db", "root", "vishakha@123");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into register values('"+name+"','"+emailid+"','"+password+"','"+city+"','"+phone+"')");
			RequestDispatcher rd = request.getRequestDispatcher("registration.html");
			rd.include(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
