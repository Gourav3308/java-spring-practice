package in.gm.beans;

public class Address {
	
	private String city;
	private int wardno;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getWardno() {
		return wardno;
	}
	public void setWardno(int wardno) {
		this.wardno = wardno;
	}
	@Override
	public String toString() {
		
		return "City="+ city+ ", Wardno="+ wardno;
	}

}
