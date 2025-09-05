package in.gm.resources;

import java.util.Arrays;
import java.util.List;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import in.gm.beans.Student;

@Configuration
@PropertySource("/in/gm/properies/student.properties")
public class config {
	
	@Bean
    public static PropertySourcesPlaceholderConfigurer pspc() {
        return new PropertySourcesPlaceholderConfigurer();
    }

	
	
	@Value("${Student.name}")
	private String name;
	
	@Value("${Student.rollno}")
	private String rollno;
	 
	
	@Value("#{'${Student.subject}'.split(',')}")
	private List<String> subject;
	
	@Bean("st")
	public Student createBean() {
		
		  
		Student s=new Student();
		
		s.setName(name);
		s.setRollno(rollno);
		s.setSubject(subject);
		
		return s;
	}
	

}
