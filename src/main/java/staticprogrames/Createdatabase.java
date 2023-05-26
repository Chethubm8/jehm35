package staticprogrames;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createdatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","rootpassword");
		Statement statement=connection.createStatement();
		statement.execute("create database newdatabase1");
		System.out.println("the database is created");
		
	}

}
