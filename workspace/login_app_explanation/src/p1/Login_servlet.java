package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Login_servlet() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			String emailid = request.getParameter("emailid");
			String password = request.getParameter("password");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject_db","root","vishakha@123");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from login where emailid='"+emailid+"' and password='"+password+"'");
			if(result.next()){
				RequestDispatcher rd = request.getRequestDispatcher("registration.html");
				rd.forward(request, response);
			}else{
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
