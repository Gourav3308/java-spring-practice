package in.gm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.gm.beans.Student;
import in.gm.resources.config;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        Student s = (Student) context.getBean("st");
        s.display();
    }
}
