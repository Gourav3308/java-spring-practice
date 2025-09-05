package in.gm.beans;

public class Student {
	
	private String name;
	private String rollno;
	private Address address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void display() {
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		System.out.println("Address :"+address);
	}

}
