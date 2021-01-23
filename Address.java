

public class Address{
	
	private String city;
	
	private String town;
	
	private String streetAdress;
	
	private String country;
	
	private String phoneNumber;
	
	public Address(String city,String town,String country,String streetAdress,String phoneNumber){
		
		setCity(city);
		
		setCountry(country);
		
		setPhoneNumber(phoneNumber);
		
		setTown(town);
		
		setStreetAdress(streetAdress);
		
		
	}
	
	public void setCity(String city){
		
		this.city=city;
		
	}
	
	public void setTown(String town){
		
		this.town=town;
		
	}
	public void setCountry(String country){
		
		this.country=country;
		
	}
	
	public void setStreetAdress(String streetAdress){
		
		this.streetAdress=streetAdress;
	}
	
	public void setPhoneNumber(String phoneNumber){
		
		this.phoneNumber=phoneNumber;
		
	}
	
	public String getCity(){
		
		return city;
	}
	
	public String getTown(){
		
		return town;
	}
	
	public String getCountry(){
		
		return country;
	}
	
	public String getStreetAdress(){
		
		return streetAdress;
	}
	
	
	public String getPhoneNumber(){
		
		return phoneNumber;
	}
}
	
	
	
	
