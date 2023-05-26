package staticprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableintheDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","rootpassword");
		Statement statement=connection.createStatement();
		statement.execute("create table student(student_id integer primary key,name varchar(20) not null,phone bigint not null unique)");
		System.out.println("student table is created");
		
		
	}

}
