package staticprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class columnaddedtotable {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","rootpassword");
		Statement statement=connection.createStatement();
		statement.execute("alter table student add course varchar(20)");
		System.out.println("column added to taBLE");
		
		
		
	}

}
