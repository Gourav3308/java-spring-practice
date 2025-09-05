package in.gm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.gm.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/in/gm/resources/applicationContext.xml");
		
		Student s=(Student)context.getBean("std");
		
		s.display();
	}

}
