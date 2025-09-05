package in.gm.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	
	private String name;
	private int rollno;
	
	@Autowired
	private Address address;
	
	public Student(@Value("Sonu") String name, @Value("61") int rollno, Address address) {
		this.name=name;
		this.rollno=rollno;
		this.address=address;
	}
	
	
	public void dp() {
		address.addinfo();
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		System.out.println("Address :"+address);
		
	}
}
