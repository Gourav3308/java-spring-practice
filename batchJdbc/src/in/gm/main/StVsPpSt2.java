package in.gm.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class StVsPpSt2 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc","root", "Sonu@12345");
						
			PreparedStatement ps=con.prepareStatement("insert into details values (?,?,?)");
			ps.setString(1, "Puja");
			ps.setString(2, "Dehradhun");
			ps.setInt(3, 69);
			ps.addBatch();
			
			ps.setString(1, "Mona");
			ps.setString(2, "Pkd");
			ps.setInt(3, 17);
			ps.addBatch();
			
			
			
			
			int [] count=ps.executeBatch();
			
			for( int i : count) {
				System.out.println(i+ " success");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
