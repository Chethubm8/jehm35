package Dynamicprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class delete_the_value_fromTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","rootpassword");
			PreparedStatement ps=c.prepareStatement("delete  from student where phone_no=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the phoneno");
			long phone_no=sc.nextLong();
			ps.setLong(1, phone_no);
			ps.execute();
			System.out.println("data deleted from table");
			
			
	}

}
