package in.gm.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.gm.beans.Address;
import in.gm.beans.Student;

@Configuration
public class config {
	
	@Bean("add")
	public Address adbean() {
		
		Address a = new Address();
		a.setCity("Forbesganj");
		a.setWardno(5);
		return a;
		
	}
	
	
	@Bean("add2")
	public Address adbean2() {
		
		Address a = new Address();
		a.setCity("Bathnaha");
		a.setWardno(4);
		return a;
		
	}
	
	
	
	@Bean("std")
	public Student ctbean() {
		
		Student s = new Student();
		s.setName("Gourav");
		s.setRollno(061);
	
		return s;
	}

}
