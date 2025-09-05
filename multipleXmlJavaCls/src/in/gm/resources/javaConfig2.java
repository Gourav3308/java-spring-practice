package in.gm.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.gm.beans.Employee;

@Configuration
public class javaConfig2 {
	
	@Bean
	public Employee createBean2() {
		Employee em=new Employee();
		
		em.setEmpId("001");
		em.setEmpName("Mohan");
		return em;
	}

}
