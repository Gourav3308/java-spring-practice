package in.gm.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc", "root", "Sonu@12345");
		
		PreparedStatement ps=con.prepareStatement("delete from details where ward_no=?");
		
		ps.setString(1, "2"); 
		
		int count=ps.executeUpdate();
		
		if(count>0) {
			System.out.println("Value deleted successfully");
		}
		else {
			System.out.println("Value doesn't deleted successfully");
		}
		ps.close();
		con.close();
	}
}
