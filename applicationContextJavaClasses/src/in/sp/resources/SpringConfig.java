package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Students;

@Configuration
public class SpringConfig {
	
	@Bean(name = "std")
	public Students createBeans() {
		
		Students s =new Students();
		s.setName("Sonu");
		s.setRollno("061");
		return s;
	}
	

	
	@Bean(name = "std2")
	public Students createBeans2() {
		
		Students s2 =new Students();
		s2.setName("Gourav");
		s2.setRollno("308");
		return s2;
	}

}
