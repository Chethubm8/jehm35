package Dynamicprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Gmail {
	 static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","rootpassword");
		Statement s=c.createStatement();
		s.execute("create database google");
		System.out.println("database created successfully");
		c.close();
		Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/google","root","rootpassword");
		Statement s1=c1.createStatement();
		s1.execute("create table gmail(phone bigint primary key,First_name varchar(28)not null,Last_name varchar(20) not null,username varchar(20) unique not null,Password varchar(20) not null unique)");
		System.out.println("table is created");
		c1.close();
		Connection c3=DriverManager.getConnection("jdbc:mysql://localhost:3306/google","root","rootpassword");
		boolean b=true;
		while(b){
			System.out.println("select any one of the value");
			System.out.println("1.Insert 2.Update 3.Fetch r retrieve 4.delete 5.Thank you 6. default");
			System.out.println("enter here");
			int a= sc.nextInt();
			switch(a){
			case 1:{
				PreparedStatement ps=c3.prepareStatement("insert into gmail values(?,?,?,?,?)");
				System.out.println("enter the phone number");
				long phone=sc.nextLong();
				System.out.println("enter user first name");
				String First_name=sc.next();
				System.out.println("enter the last name");
				String Last_name=sc.next();
				System.out.println("enter username");
				String username=sc.next();
				System.out.println("enter the password ");
				String Password=sc.next();
				ps.setLong(1, phone);
				ps.setString(2, First_name);
				ps.setString(3, Last_name);
				ps.setString(4, username);
				ps.setString(5, Password);
				ps.execute();
				System.out.println("invalid values");
				break;
			}
			case 2:{
				PreparedStatement ps1=c3.prepareStatement("update Gmail set First_name=?,Last_name=?,username=?,Password=? where phone=?");
				System.out.println("enter  the first name to update");
				String First_name=sc.next();
				System.out.println("enter lastname to update");
				String Last_name=sc.nextLine();
				System.out.println("enter username to update");
				String username=sc.next();
				System.out.println("enter the password to update");
				String Password=sc.next();
				System.out.println("enter the primary key as your phone number");
				long phone=sc.nextLong();
				ps1.setString(1, First_name);
				ps1.setString(2, Last_name)	;
				ps1.setString(3, username);
				ps1.setString(4, Password);
				ps1.executeUpdate();
				System.out.println("the values are updatd successfully");
				break;
			}
			case 3:{
				PreparedStatement ps2=c3.prepareStatement("select * from gmail where phone=? ");
				System.out.println("enter the primary key as phone to fetch  or retrieve from the table");
				long phone=sc.nextLong();
				ps2.setLong(1, phone);
				ResultSet rs=ps2.executeQuery();
				rs.next();
				System.out.println("phone:"+rs.getLong(1)+" "+"First_name:"+rs.getString(2)+" "+"Last_name:"+rs.getString(3)+"username:"+rs.getString(4)+" "+"Password:"+rs.getString(5));
				break;
			}
			case 4:{
				PreparedStatement ps3=c3.prepareStatement("delete from Gmail where phone=?");
				System.out.println("enter the primary key as phone to delete the row from table");
				long phone=sc.nextLong();
				ps3.setLong(1, phone);
				ps3.execute();
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
