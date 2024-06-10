package p1;

import java.sql.*;
import java.util.Scanner;

public class C {

				@SuppressWarnings("resource")
				public static void main(String[] args) {
					try {
						Scanner scan = new Scanner(System.in);
						System.out.println("Enter your registered emailid:");
						String emailid = scan.next();
						
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice_JDBC","root","vishakha@123");
						
						//Insert a record into the table student.
						
						PreparedStatement stmnt = con.prepareStatement("delete from student where emailid=?");
						stmnt.setString(1,emailid);

						stmnt.executeUpdate();
						//Close the DB connection.
						
						con.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}