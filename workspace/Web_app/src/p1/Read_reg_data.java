package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Read_reg_data")
public class Read_reg_data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Read_reg_data() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject_db","root","vishakha@123");
			Statement stmt = con.createStatement();
			ResultSet results = stmt.executeQuery("select * from registration");
			PrintWriter out = response.getWriter();
			out.println("<table border= '1'>");
			out.println("<tr>");
			out.println("<th>");	
			out.println("name");
			out.println("</th>");
			out.println("<th>");	
			out.println("emailid");
			out.println("</th>");
			out.println("<th>");	
			out.println("password");
			out.println("</th>");
			out.println("<th>");	
			out.println("city");
			out.println("</th>");
			out.println("<th>");	
			out.println("phone");
			out.println("</th>");
			out.println("</tr>");
			while(results.next()){
				out.println("<tr>");
				out.println("<td>");	
				out.println(results.getString(1));	
				out.println("</td>");
				out.println("<td>");	
				out.println(results.getString(2));	
				out.println("</td>");
				out.println("<td>");	
				out.println(results.getString(3));	
				out.println("</td>");
				out.println("<td>");	
				out.println(results.getString(4));	
				out.println("</td>");
				out.println("<td>");	
				out.println(results.getString(5));	
				out.println("</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("I am from doPost()");
	}

}
