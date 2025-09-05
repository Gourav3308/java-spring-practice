package in.gm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.gm.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext container= new ClassPathXmlApplicationContext("/in/gm/resources/applicationContext.xml");
		
		Student st=(Student) container.getBean("std");
		st.display();
	}
}
