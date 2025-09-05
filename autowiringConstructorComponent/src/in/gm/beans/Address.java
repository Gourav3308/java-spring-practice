package in.gm.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String city;
	private int wardno;
	
	public Address(@Value("Forbesganj") String city,  @Value("04") int wardno) {
		
		this.city=city;
		this.wardno=wardno;
	}
	
	
	@Override
	public String toString() {
		
		return "City="+ city+ ", Wardno="+ wardno;
	}
	
	public void addinfo() {
		System.out.println("U will find here address details");
	}

}
