package Dynamicprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_the_values_into_table {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","rootpassword");
		PreparedStatement ps=c.prepareStatement("insert into student values(?,?,?)");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the studentcontact");
		Long phone=sc.nextLong();
		ps.setLong(1,phone);
		System.out.println("enter the name");
		String name=sc.next();
		ps.setString(2, name);
		System.out.println("enter the course");
		String course=sc.next();
		ps.setString(3, course);
		ps.execute();
		System.out.println("inserted successfully");
		
		
	}

}
