package staticprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updatethevaluesinthetable {
		public static void main(String[] args) throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root",
					"rootpassword");
			Statement statement = connection.createStatement();
			statement.execute("update student set name='nagu',phone=9880351944 where student_id=6");
			statement.execute("update student set name='chethu',phone=8088506919 where student_id=2");
			statement.execute("update student set name='amma',phone=9901294640 where student_id=3");
			statement.execute("update student set name='iddu',phone=7483692062 where student_id=6");
			statement.execute("update student set name='iddu',phone=7483692062 where student_id=6");
			statement.execute("update student set name='iddu',phone=7483692062 where student_id=6");
			
			
			System.out.println("the value is inserted");
	}
	}


