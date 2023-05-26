package staticprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertintoemp {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase1", "root",
				"rootpassword");
		Statement statement = connection.createStatement();
		statement.execute("insert into emp values(1,'chethan',9538328577)");
		System.out.println("the values inserted into emp");
	}

}
