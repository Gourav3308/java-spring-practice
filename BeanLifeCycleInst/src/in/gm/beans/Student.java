package in.gm.beans;

import java.security.PublicKey;

public class Student {
	
//	public Student() {
//			System.out.println("Constructor call");	
//	}
	
	
	public Student(int a) {
		System.out.println("Constructor call");
	}
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
	
//	public static Student factorymeth() {
//		Student s =new Student(1);
//		return s;
	}


