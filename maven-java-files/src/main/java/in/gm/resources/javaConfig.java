package in.gm.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.gm.beans.Student;

@Configuration
public class javaConfig {
	
	@Bean("Std")
	public Student createBean() {
		Student s=new Student();
		s.setName("Gourav");
		s.setRollno(061);
		return s;
	}

}
