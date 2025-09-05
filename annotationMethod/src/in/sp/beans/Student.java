package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean")
public class Student {
	
	@Value("Sonu")
	private String name;
	
	@Value("061")
	private String rollno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public void display() {
		System.out.println("Name :"+ name);
		System.out.println("Rollno :"+rollno);
	}
	

}
