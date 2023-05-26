package staticprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.result.ResultSetFactory;
public class FetchthevaluesfromtheDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","rootpassword");
		Statement statement=connection.createStatement();
		ResultSet resultset=statement.executeQuery("select * from student");
		 while(resultset.next()){;
		System.out.println("student_id"+resultset.getInt(1)+" "+"name:"+resultset.getString(2)+" "+resultset.getLong(3));
		
		
		
	}

}}
