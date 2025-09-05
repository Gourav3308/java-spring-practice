package in.gm.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		String myname=sc.nextLine();
		
		System.out.println("Enter wardno:");
		int wardno=sc.nextInt();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc", "root", "Sonu@12345");
	
	   // Statement st=con.createStatement();
	   
	  // String query = "SELECT * FROM details WHERE name='" + myname + "' AND ward_no=" + wardno;
	   PreparedStatement ps=con.prepareStatement("Select * from details where name=? AND ward_no=?");
	    ps.setString(1, myname);
	    ps.setInt(2, wardno);
	    
	    ResultSet rs= ps.executeQuery();
	    
	    if(rs.next()) {
	    	System.out.println("Login sucess");
	    }
	    else {
	    	System.out.println("Login fail");
		}
	
	
	}

}
