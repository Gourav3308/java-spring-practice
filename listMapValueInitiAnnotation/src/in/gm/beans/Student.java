package in.gm.beans;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("st")
public class Student {

    @Value("${Student.name}")
    private String name;

    @Value("${Student.rollno}")
    private String rollno;

    @Value("#{'${Student.subject}'.split(',')}")
    private List<String> subject;

    public void display() {
        System.out.println("Name     : " + name);
        System.out.println("Roll no  : " + rollno);
        System.out.println("Subjects : " + subject);
    }
}
