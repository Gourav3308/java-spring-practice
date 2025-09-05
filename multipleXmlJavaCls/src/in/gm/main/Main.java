package in.gm.main;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.gm.beans.Employee;
import in.gm.beans.Student;
import in.gm.resources.javaConfig;
import in.gm.resources.javaConfig2;

public class Main {
    public static void main(String[] args) {
    	
    	//ApplicationContext context=new ClassPathXmlApplicationContext("/in/gm/resources/applicationContext.xml", 
    	//		"/in/gm/resources/applicationContext2.xml");
    	  	
    	
//    	// Student s=(Student) context.getBean("std");
//    	 //s.display();
//    	 
//    	 //Employee e=(Employee) context.getBean("emp");
//    	 //e.dispinfo();
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class, javaConfig2.class);
    	
    	 Student s=(Student) context.getBean("createBean");
    	 s.display();
    	 
    	 Employee e=(Employee) context.getBean("createBean2");
    	 e.dispinfo();
    	
    	
    	 
		
	}
	
			 
}
