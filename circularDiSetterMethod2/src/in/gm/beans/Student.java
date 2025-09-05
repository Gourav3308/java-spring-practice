package in.gm.beans;

public class Student {
	
	private String name;
	private String rollno;
	private Address address;
	
	public Student(String name,String rollno,Address address) {
		this.name=name;
		this.rollno=rollno;
		this.address=address;
	}
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		System.out.println("Address :"+address);
	}

}
