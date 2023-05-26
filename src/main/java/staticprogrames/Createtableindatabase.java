package staticprogrames;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Createtableindatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase1","root","rootpassword");
		Statement statement=connection.createStatement();
		statement.execute("create table emp1(empid integer(2) primary key ,ename varchar(10) not null,phone bigint not null)" );
		System.out.println("table is created in database1 ");
		
	}

}
