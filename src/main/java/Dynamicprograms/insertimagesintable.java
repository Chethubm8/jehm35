package Dynamicprograms;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertimagesintable {
	
		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","rootpassword");
			PreparedStatement ps=c.prepareStatement("insert into employee values(9,'nagu','bed',?)");
			FileInputStream fi=new FileInputStream("D:\\DSC_6091.jpg");
			ps.setBinaryStream(1, fi);
			ps.execute();
			System.out.println("details entered successfully");
	}

}
