package staticprogrames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class crudoperationinsingleclass {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","rootpassword");
		Statement statement=connection.createStatement();
		statement.execute("create database pancard");
		System.out.println("database created successfully");
		connection.close();
		
		
		Connection connection1=DriverManager.getConnection("jdbc:mysql://localhost:3306/pancard","root","rootpassword");
		Statement statement1=connection1.createStatement();
		
		
		
		statement1.execute("create table user(pan_id varchar(20) primary key , name varchar(20) not null,email varchar(20) not null,phoneno bigint  not null unique)");
		System.out.println("table is  created successfully ");
		
		
		statement1.execute("insert into user values('BLVPC4697N','CHETHAN','thanc98@gmail.com',9538328577)");
		System.out.println("table is  inserted successfully ");
		
		
		statement1.execute("update user set name ='chethu' where pan_id='BLVPC4697N' ");
		System.out.println("value is  updated successfully ");
		
		ResultSet resultset=statement1.executeQuery("select* from user");
		resultset.next();
		System.out.println("pan_id:"+resultset.getString(1)+" "+"name:"+resultset.getString(2)+" "+"email_id:"+resultset.getString(3)+" "+"phoneno:"+resultset.getLong(4));
		
		
		statement1.execute("delete from user");
		System.out.println("all the value deleted successfully ");
		
		statement1.execute("drop table user");
		System.out.println("table is  droped successfully ");
		
	}

}
