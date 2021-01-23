
public class Student{
	
	private String Name;
	
	private String email;
	
	private String cnic;
	
	private Address ad;
	
	
	

	
    public Student(String Name,String cnic,Address ad){
		
		setName(Name);
		
		setCnic(cnic);
		
		setAd(ad);
		
		
	}
	
	public void setName(String Name){
		
		this.Name=Name;
	}
	
	public void setEmail(String email){
		
		this.email=email;
	}
	
	public void setCnic(String cnic){
		
		this.cnic=cnic;
	}
	
	public void setAd(Address ad){
		
		this.ad=ad;
		
	}
	
	
	public String getEmail(){
		
		return email;
	}
	
	public String getName(){
		
		return Name;
	}
	public String getCnic(){
		
		return cnic;
	}
	
	
	public Address getAd(){
		
		return ad;
	}
	
	
	
	
	
	
	
	
	
	
}