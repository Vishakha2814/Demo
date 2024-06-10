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

@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Update() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("I am from doGet()");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String emailid = request.getParameter("emailid");
		String phone = request.getParameter("phone");
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject_DB","root","vishakha@123");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("UPDATE registration SET phone='"+phone+"' WHERE emailid='"+emailid+"' "); 
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}