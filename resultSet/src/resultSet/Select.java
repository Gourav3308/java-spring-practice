package resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc", "root", "Sonu@12345");
	
	   PreparedStatement ps=con.prepareStatement("select * from details");
	   
	   ResultSet rs=ps.executeQuery();
	   
	   while(rs.next()) {
		   String name=rs.getString("name");
		   String city=rs.getString("city");
		   int ward_no=rs.getInt("ward_no");
		   System.out.println("Name :"+ name+ ", City :"+ city+ ", Ward_no :"+ ward_no);
	   }
	 
	}

}
