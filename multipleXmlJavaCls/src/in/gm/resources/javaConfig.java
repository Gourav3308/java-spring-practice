package in.gm.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.gm.beans.Student;

@Configuration
public class javaConfig {
	
	@Bean
	public Student createBean() {
		Student st = new Student();
		st.setName("Gourav");
		st.setRollno("061");
		return st;
	}

}
