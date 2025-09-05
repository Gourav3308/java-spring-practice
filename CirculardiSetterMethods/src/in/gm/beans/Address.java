package in.gm.beans;

public class Address {
	
	private String city;
	private String wardno;
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getWardno() {
		return wardno;
	}
	public void setWardno(String wardno) {
		this.wardno = wardno;
	}
	
	public void adddisp() {
		System.out.println(" In Address Method "+ student);
	}

}
