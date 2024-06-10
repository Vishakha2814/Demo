package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class Registration_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Registration_servlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("I am from doGet()");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		String city = request.getParameter("city");
		String phone = request.getParameter("phone");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject_DB","root","vishakha@123");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into registration values('"+name+"','"+emailid+"','"+password+"','"+city+"','"+phone+"')"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}