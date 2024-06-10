package p1;

import java.sql.*;

public class B {

	public static void main(String[] args) {
		try {
			//Connect with database.
			//A connection (session) with a specific database. 
			//SQL statements are executed and results are returned within the context of a connection.
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice_JDBC","root","vishakha@123");
			
			//Insert a record into the table student.
			
			Statement stmnt = con.createStatement(); //createStatement() method creates a Statement instance 
			//for sending SQL statements to the database.
			
			ResultSet results = stmnt.executeQuery("select * from student");
			while (results.next()) {
				System.out.println(results.getString(1));
				System.out.println(results.getString(2));
				System.out.println(results.getString(3));
				System.out.println(results.getString(4 ));
			}
			//Close the DB connection.n
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
