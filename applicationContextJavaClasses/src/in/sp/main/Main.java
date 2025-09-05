package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Students;
import in.sp.resources.SpringConfig;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext container= new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Students st=(Students) container.getBean("std");
		st.display();
		
		
		System.out.println("--------------------------");
		
		Students st2=(Students) container.getBean("std2");
		st2.display();
	}
}
