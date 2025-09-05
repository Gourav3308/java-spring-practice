package in.gm.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.gm.beans.Address;
import in.gm.beans.Student;

@Configuration
public class config {
	
	@Bean("add")
	public Address adbean() {
		
		Address a = new Address("Forbesganj",5);
		
		return a;
		
	}
	
	
	
	@Bean("std")
	public Student ctbean() {
		
		Student s = new Student("Gourav",061,adbean());
	
		return s;
	}

}
