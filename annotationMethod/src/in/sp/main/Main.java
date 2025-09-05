package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.javaConfig;

public class Main {
	public static void main(String[] args) {
		
		
		
	//	ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
	
		ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
		Student s=(Student) context.getBean("bean");
		
		s.display();
	
	}

}
