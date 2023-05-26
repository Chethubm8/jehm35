package staticprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Newdatabasecreation2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "rootpassword");
		Statement statement = connection.createStatement();
		statement.execute("create database newdatabase3");
		System.out.println("database is created");

	}
}
