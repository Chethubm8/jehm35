package PreparedStatementstaticprog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Staticprogramusingpreparedstatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","rootpassword");
		PreparedStatement p=c1.prepareStatement("create database jspider");
		p.execute();
		System.out.println("database created successfully");
		p.close();
		
		Connection c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","rootpassword");
		PreparedStatement ps=c2.prepareStatement("create table student(phone_no bigint primary key,sname varchar(35) not null,course varchar(20) not null)");
		ps.execute();
		System.out.println("table created successfully");
		PreparedStatement ps1=c2.prepareStatement("insert into student values(9538328577,'sridevi','javafullstack' )");
		ps1.execute();
		System.out.println("inserted succcessfully");
		PreparedStatement ps2=c2.prepareStatement("update student set course='python' where phone_no=9538328577");
		ps2.execute();
		System.out.println("data modified successfully");
		PreparedStatement ps3=c2.prepareStatement("select * from student");
		ResultSet rs=ps3.executeQuery();
		rs.next();
		System.out.println("phone_no:"+rs.getLong(1)+"name:"+rs.getString(2)+"course:"+rs.getString(3));
		PreparedStatement ps4=c2.prepareStatement("delete from student");
		ps4.execute();
		System.out.println("deleted");
	}

}
