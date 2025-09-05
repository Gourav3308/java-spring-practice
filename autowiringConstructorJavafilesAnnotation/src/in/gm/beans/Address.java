package in.gm.beans;

public class Address {
	
	private String city;
	private int wardno;
	
	public Address(String city,int wardno) {
		
		this.city=city;
		this.wardno=wardno;
	}
	
	
	@Override
	public String toString() {
		
		return "City="+ city+ ", Wardno="+ wardno;
	}

}
