package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Students;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext container= new ClassPathXmlApplicationContext("/in/gm/resources/applicationContext.xml");
		
		Students st=(Students) container.getBean("std");
		st.display();
	}
}
