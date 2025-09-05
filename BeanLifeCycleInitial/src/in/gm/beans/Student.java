package in.gm.beans;

import java.security.PublicKey;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean{
	

	//public class Student {
		
	private String name;
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
		System.out.println("Display method ");
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
	}
	
	//  using custom init() method
	
//	public void valueset() {
//		name="sonu";
//		rollno="060";
//	}
	
	
	
	//using afterPropertiesSet() method of InitializingBean callback interface

	@Override
    public void afterPropertiesSet() throws Exception {
       name="Sonu";
       rollno="061";
    }
	
	
	
//	@PostConstruct
//    public void init() {
//        name="Sonu";
//        rollno="061";
//    }
	

	}


