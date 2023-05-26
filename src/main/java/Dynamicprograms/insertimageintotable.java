package Dynamicprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertimageintotable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","rootpassword");
		PreparedStatement ps=c.prepareStatement("insert into student values(9538328457,'yuvi','javafulstack',?)");
		FileInputStream fi=new FileInputStream("C:\\Desktop\\image.jpg");
		ps.setBinaryStream(1,fi);
		ps.execute();
		System.out.println("data inserted successfully");
		
	}

}
