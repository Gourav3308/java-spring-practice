package in.gm.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Cp1 {
	
	public static void main(String[] args) {
		
		HikariConfig config = new HikariConfig();
		
		config.setJdbcUrl("jdbc:mysql://localhost:3306/newjdbc");
		config.setUsername("root");
		config.setPassword("Sonu@12345");
		
        config.setMaximumPoolSize(10);
		
		HikariDataSource dataSource = new HikariDataSource(config);
		
		try (Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into items values(?,?,?)");
            )
		{
			ps.setInt(1, 101);
			ps.setString(2, "jeans");
			ps.setInt(3, 599);
			
			int count = ps.executeUpdate();
			if(count > 0)
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("fail");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
