package in.gm.beans;

public class Address {
	
	private String city;
	private String wardno;
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
	
	public String toString() {
		return "city :" +city+ " ; Ward no :" +wardno;
	}

}
