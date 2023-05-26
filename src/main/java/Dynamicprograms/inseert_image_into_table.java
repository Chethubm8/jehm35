package Dynamicprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class inseert_image_into_table {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","rootpassword");
		PreparedStatement ps=c.prepareStatement("insert into student values(9880351944,'nagu','bed',?)");
		FileInputStream fi=new FileInputStream("D:\\DSC_6091.jpg");
		ps.setBinaryStream(1, fi);
		ps.execute();
		System.out.println("details entered successfully");
		
		
	}

}
