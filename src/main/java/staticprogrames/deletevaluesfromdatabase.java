package staticprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class deletevaluesfromdatabase {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root",
			"rootpassword");
	Statement statement = connection.createStatement();
	statement.execute("delete from student");
	System.out.println("deleted");}
	

	
	
	
}
