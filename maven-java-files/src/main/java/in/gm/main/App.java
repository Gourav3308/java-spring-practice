package in.gm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.gm.beans.Student;
import in.gm.resources.javaConfig;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(javaConfig.class);
        
        Student s=(Student)context.getBean("Std");
        s.display();
        }
    }

