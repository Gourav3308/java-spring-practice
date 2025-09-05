package in.gm.beans;

public class Address {
	
	private String city;
	private String wardno;
	
	
	public Address(String city,String wardno) {
		this.city=city;
		this.wardno=wardno;
		
	}
	public String toString() {
		return "city :" +city+ " ; Ward no :" +wardno;
	}

}
