package in.gm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public  class InsertDaoImp implements InsertDao{

	boolean status=false;
	@Override
	public boolean insertion() {
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/newjdbc", "root", "Sonu@12345");
		
		PreparedStatement  ps=con.prepareStatement("insert into items  values(?,?,?)");
		ps.setInt(1, 69);
		ps.setString(2, "Jeans");
		ps.setInt(3, 999);
		
		int count=ps.executeUpdate();
		
		if(count>0) {
			status=true;
		}
		else {
			status=false;
		}
		} catch (Exception e) {
			status=false;
			e.printStackTrace();
		}
		return status;
		
	}

}
