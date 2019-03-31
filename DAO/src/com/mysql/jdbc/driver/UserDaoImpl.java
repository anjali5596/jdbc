package com.mysql.jdbc.driver;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;
public  interface UserDaoImpl{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the serialno");
			int s=sc.nextInt();
			System.out.println("enter the name");
			String name=sc.next();
			System.out.println("enter the caption");
			String Caption=sc.next();
			System.out.println("enter the points");
			int points=sc.nextInt();
			Connection con=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
		try{
			java.sql.Driver d = new com.mysql.jdbc.Driver();
	      	DriverManager.registerDriver(d);
		  	String url="jdbc:mysql://localhost:3306/CapsJava_db";
		  	FileReader fr=new FileReader("C:/Users/user/Desktop/Test/db_Credentials.Properties");
			Properties prop=new Properties();
			prop.load(fr);
			con = DriverManager.getConnection(url,prop);
			String Query="insert into Ipl_table values(?,?,?,?)";
			pstmt=con.prepareStatement(Query);
			pstmt.setInt(1, s);
			pstmt.setString(2, name);
			pstmt.setString(3, Caption);
			pstmt.setInt(4, points);
			int count=pstmt.executeUpdate();
			if(count>0)
				System.out.println("data added successfully");
			else
			System.out.println("something wrong");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			if(con!=null){
				try{
					con.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
			if(rs!=null){
				try{
					rs.close();
				}
				catch(Exception e){
					e.printStackTrace();
		
}
}
			if(pstmt!=null){
				try{
					pstmt.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		}
System.out.println("delete the records");
Scanner sc1=new Scanner(System.in);
System.out.println("enter the serialno");
int s1=sc1.nextInt();
//Connection con=null;
//PreparedStatement pstmt=null;
//ResultSet rs=null;
try{
	java.sql.Driver d = new com.mysql.jdbc.Driver();
  	DriverManager.registerDriver(d);
  	String url="jdbc:mysql://localhost:3306/CapsJava_db";
  	FileReader fr=new FileReader("C:/Users/user/Desktop/Test/db_Credentials.Properties");
	Properties prop=new Properties();
	prop.load(fr);
	con = DriverManager.getConnection(url,prop);
String Query="delete from Ipl_table where si_no=?";
pstmt=con.prepareStatement(Query);
pstmt.setInt(1, s1);
int count=pstmt.executeUpdate();
if(count>0)
	System.out.println("data removed successfully");
else
System.out.println("something wrong");
}
catch (Exception e) {
	e.printStackTrace();
}
finally
{
	if(con!=null){
		try{
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	if(rs!=null){
		try{
			rs.close();
		}
		catch(Exception e){
			e.printStackTrace();

}
}
	if(pstmt!=null){
		try{
			pstmt.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
System.out.println("update the table");
Scanner sc2=new Scanner(System.in);
System.out.println("enter the serialno");
int s2=sc2.nextInt();
//Connection con=null;
//PreparedStatement pstmt=null;
//ResultSet rs=null;
try{
	java.sql.Driver d = new com.mysql.jdbc.Driver();
  	DriverManager.registerDriver(d);
  	String url="jdbc:mysql://localhost:3306/CapsJava_db";
  	FileReader fr=new FileReader("C:/Users/user/Desktop/Test/db_Credentials.Properties");
	Properties prop=new Properties();
	prop.load(fr);
	con = DriverManager.getConnection(url,prop);
String Query="update Ipl_table set name='cs' where Si_no=?";
pstmt=con.prepareStatement(Query);
pstmt.setInt(1, s2);
int count=pstmt.executeUpdate();
if(count>=0)
	System.out.println("table updated successfully");
else
System.out.println("something wrong");
}
catch (Exception e) {
	e.printStackTrace();
}
finally
{
	if(con!=null){
		try{
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	if(rs!=null){
		try{
			rs.close();
		}
		catch(Exception e){
			e.printStackTrace();

}
}
	if(pstmt!=null){
		try{
			pstmt.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
//Connection con=null;
Statement stmt=null;
//ResultSet rs=null;
System.out.println("read the user");
try {
	java.sql.Driver d = new com.mysql.jdbc.Driver();
	DriverManager.registerDriver(d);
	String url="jdbc:mysql://localhost:3306/CapsJava_db?user=root&password=root";
	con=(Connection) DriverManager.getConnection(url);
	String query="select * from Ipl_table";
	stmt=(Statement) con.createStatement();
	rs=stmt.executeQuery(query);
	while(rs.next()){
		int Sno3=rs.getInt("Si_no");
		String name3=rs.getString("name");
		String cap3=rs.getString("caption");
		int points3=rs.getInt("points");
		System.out.println(Sno3);
		System.out.println(name3);
		System.out.println(cap3);
		System.out.println(points3);
		System.out.println("********");
	}
}
catch (SQLException e) {
	e.printStackTrace();
}
finally
{
	if(con!=null){
		try{
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	if(rs!=null){
		try{
			rs.close();
		}
		catch(Exception e){
			e.printStackTrace();

}
}
	if(stmt!=null){
		try{
			stmt.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
}
}