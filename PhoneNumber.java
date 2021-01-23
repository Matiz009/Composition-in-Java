

public class PhoneNumber{
	
	private int countryCode;
	
	private String cityCode;
	
	private int lineNumber;
	
	public void setCountryCode(int countryCode){
		
		this.countryCode=countryCode;
	}
	
	public void setCityCode(String cityCode){
		
		this.cityCode=cityCode;
	}
	
	public void setLineNumber(int lineNumber){
		
		this.lineNumber=lineNumber;
	}	
	
	public int getCountryCode(){
		
		return countryCode;
	}
	
	public String getCityCode(){
		
		return cityCode;
	}
	
	public int getLineNumber(){
		
		return lineNumber;
	}
	
	
	
	
}