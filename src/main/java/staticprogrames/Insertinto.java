package staticprogrames;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insertinto {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1", "root",
				"rootpassword");
		Statement statement = connection.createStatement();
		statement.execute("insert into student values(6,'sidu',9538328571)");
		statement.execute("insert into student values(2,'muddu',9538328578)");
		statement.execute("insert into student values(3,'geddu',9538328579)");
		statement.execute("insert into student values(4,'biddu',9538328580)");
		statement.execute("insert into student values(5,'oddu',9538328581)");
		System.out.println("the value is inserted");

	}

}
