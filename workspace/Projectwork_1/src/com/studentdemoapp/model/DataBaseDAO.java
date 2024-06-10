package com.studentdemoapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseDAO {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdemoapp", "root"
					,"vishakha@123");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean verifyLoginCredentials(String emailid, String password, Connection con) {
		try {
			Statement stmnt = con.createStatement(); 
			ResultSet results = stmnt.executeQuery(  
					"select * from login where emailid='" + emailid + "' and password='" + password + "'");
			return results.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void createReg(String name, String emailid, String password, String city, String phone, Connection con) {
		try {
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into student_info values('" + name + "','" + emailid + "','" + password + "','"
					+ city + "','" + phone + "')");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet getAllReg(Connection con) {
		try {
			Statement stmnt = con.createStatement();
			ResultSet results = stmnt.executeQuery("select * from student_info");
			return results;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void deleteStudentByEmailid(String emailid,Connection con){
		try {
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("Delete from student_info where emailid='"+emailid+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}