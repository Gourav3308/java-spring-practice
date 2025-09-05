package in.gm.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Creation {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc", "root", "Sonu@12345");
		
		PreparedStatement ps=con.prepareStatement("insert into details values(?,?,?)");
		ps.setString(1, "Ram");
		ps.setString(2, "pkd");
		ps.setString(3, "16");
		
		int count=ps.executeUpdate();
		
		if(count>0) {
			System.out.println("Values insert successfully");
		}
		else {
			System.out.println("Values haven't inserted successfully");

		}
		ps.close();
		con.close();
	}
	
}
