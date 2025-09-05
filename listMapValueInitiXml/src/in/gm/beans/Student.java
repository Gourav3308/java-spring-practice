package in.gm.beans;

import java.util.List;
import java.util.Map;

public class Student {
	
	private String name;
	private String rollno;
	
	private List<String> subject;
	//private Map<String, String> submarks;

	

//	public Map<String, String> getSubmarks() {
//		return submarks;
//	}
//
//	public void setSubmarks(Map<String, String> submarks) {
//		this.submarks = submarks;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

//	public List<String> getSubject() {
//		return subject;
//	}
//
//	public void setSubject(List<String> subject) {
//		this.subject = subject;
//	}
	
	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		System.out.println("subjects :"+subject);
		//System.out.println("Subjects & Marks :"+ submarks);
		
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}

}
