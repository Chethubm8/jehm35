package Dynamicprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class update_the_values_in_table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","rootpassword");
		PreparedStatement ps=c.prepareStatement("update student set sname=? where phone_no=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String sname=sc.next();
		ps.setString(1,sname);
		System.out.println("enter the phonenumber");
		Long phone_no=sc.nextLong();
		ps.setLong(2, phone_no);
		ps.execute();
		System.out.println("inserted successfully");
	}

}
