package Dynamicprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Fetchingthevaluesusingpreperedstatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","rootpassword");
		PreparedStatement ps=c.prepareStatement("select* from student where phone_no in(?,?)");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the phoneno");
		long phone_no=sc.nextLong();
		ps.setLong(1, phone_no);
		System.out.println("enter another phone no");
		long phone_no1=sc.nextLong();
		ps.setLong(2, phone_no1);
		
		ResultSet rs=ps.executeQuery();
		while (rs.next()){
			System.out.println("phone_no:"+rs.getLong(1)+"sname:"+rs.getString(2)+"course:"+rs.getString(3));
		}
		
	}

}
