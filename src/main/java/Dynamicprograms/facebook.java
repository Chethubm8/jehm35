package Dynamicprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class facebook {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","rootpassword");
		PreparedStatement ps=c.prepareStatement("create database facebook");
		ps.execute();
        System.out.println("database created successfully");
		c.close();
		
		Connection c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook","root","rootpassword");
		PreparedStatement ps1=c2.prepareStatement("create table user(phone_no bigint primary key,first_name varchar(28)not null,Last_name varchar(20) not null,username varchar(20) unique not null,password varchar(20) not null unique)");
		ps1.execute();
		System.out.println("table created successfully");
		c2.close();
		Connection c3=DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook","root","rootpassword");
		boolean b=true;
		while(b){
			System.out.println("select any one of the value");
			System.out.println("1.Insert 2.Update 3.Fetch r retrieve 4.delete 5.Thank you 6. default");
			System.out.println("enter here");
			int a= sc.nextInt();
			switch(a){
			case 1:{
				PreparedStatement ps2=c3.prepareStatement("insert into user values(?,?,?,?,?)");
				System.out.println("enter the phone number");
				long phone_no=sc.nextLong();
				System.out.println("enter user first name");
				String first_name=sc.next();
				System.out.println("enter the last name");
				String Last_name=sc.next();
				System.out.println("enter username");
				String username=sc.next();
				System.out.println("enter the password ");
				String password=sc.next();
				ps2.setLong(1, phone_no);
				ps2.setString(2, first_name);
				ps2.setString(3, Last_name);
				ps2.setString(4, username);
				ps2.setString(5, password);
				ps2.execute();
				System.out.println("invalid values");
				break;
			}
			case 2:{
				PreparedStatement ps3=c3.prepareStatement("update user set first_name=?,Last_name=?,username=?,password=? where phone_no=?");
				System.out.println("enter  the first name to update");
				String first_name=sc.next();
				System.out.println("enter lastname to update");
				String Last_name=sc.next();
				System.out.println("enter username to update");
				String username=sc.next();
				System.out.println("enter the password to update");
				String password=sc.next();
				System.out.println("enter the primary key as your phone number");
				long phone_no=sc.nextLong();
				ps3.setString(1, first_name);
				ps3.setString(2, Last_name)	;
				ps3.setString(3, username);
				ps3.setString(4, password);
				ps3.executeUpdate();
				System.out.println("the values are updatd successfully");
				break;
			}
			case 3:{
				PreparedStatement ps4=c3.prepareStatement("select * from user where phone_no=? ");
				System.out.println("enter the primary key as phone to fetch  or retrieve from the table");
				long phone_no=sc.nextLong();
				ps4.setLong(1, phone_no);
				ResultSet rs=ps4.executeQuery();
				rs.next();
				System.out.println("phone_no:"+rs.getLong(1)+" "+"first_name:"+rs.getString(2)+" "+"Last_name:"+rs.getString(3)+"username:"+rs.getString(4)+" "+"Password:"+rs.getString(5));
				break;
			}
			case 4:{
				PreparedStatement ps5=c3.prepareStatement("delete from user where phone_no=?");
				System.out.println("enter the primary key as phone_no to delete the row from table");
				long phone_no=sc.nextLong();
				ps5.setLong(1, phone_no);
				ps5.execute();
				System.out.println("the values of respective primary key row is deleted");
				break;
			}
			case 5:{
				System.out.println("successfully did the crud operation thank you");
				b=false;
				break;
			}
			case 6:
				default:
					System.out.println("invalid choice");
			c3.close();

}}}}

	


