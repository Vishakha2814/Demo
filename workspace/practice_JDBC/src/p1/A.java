package p1;

import java.sql.*;
import java.util.Scanner;
public class A {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			//Connect with database.
			//A connection (session) with a specific database. 
			//SQL statements are executed and results are returned within the context of a connection.
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your name:");
			String name = scan.next();
			System.out.println("Enter your city:");
			String city = scan.next();
			System.out.println("Enter your registered emailid:");
			String emailid = scan.next();
			System.out.println("Enter your phone:");
			String phone = scan.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice_JDBC","root","vishakha@123");
			
			//Insert a record into the table student.
			
			PreparedStatement stmnt = con.prepareStatement("Insert into student values(?,?,?,?)");
			stmnt.setString(1,name);
			stmnt.setString(2,city);
			stmnt.setString(3,emailid);
			stmnt.setString(4,phone);
			stmnt.executeUpdate();
			//Close the DB connection.
			System.out.println("Record is successfully inserted");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}