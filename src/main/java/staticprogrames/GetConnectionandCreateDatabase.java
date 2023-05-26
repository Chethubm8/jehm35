package staticprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GetConnectionandCreateDatabase {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","rootpassword");
		Statement statement=connection.createStatement();
		//boolean b=statement.execute("create database database1");
		//boolean b=statement.execute("create table employee(id integer(2) primary key,name varchar(14),address varchar(40))");
		int b=statement.executeUpdate("insert into employee values(1,'chethan','bhk') ");
		System.out.println("table is created");
		connection.close();
		
	}

}
