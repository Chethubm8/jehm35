package staticprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Updatevalues {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/newdatabase1","root","rootpassword");
	Statement statement=connection.createStatement();
	statement.execute("update chocolates  set chocname='aase',cost=1 where chocid=1");
	statement.execute("update chocolates  set chocname='copico',cost=10 where chocid=2");
	statement.execute("update chocolates  set chocname='snickers',cost=20 where chocid=3");
	statement.execute("update chocolates  set chocname='bommer',cost=30 where chocid=4");
	statement.execute("update chocolates  set chocname='cntrfrsh',cost=40 where chocid=5");
	statement.execute("update chocolates  set chocname='fruity',cost=50 where chocid=6");
	statement.execute("update chocolates  set chocname='bnana',cost=60 where chocid=7");
	System.out.println("updated successfully");
}


}
