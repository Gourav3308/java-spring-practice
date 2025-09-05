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
	
	@Override
    public String toString() {
        return "Address{city='" + city + "', wardno='" + wardno + "'}";
    }

}
