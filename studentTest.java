
public class studentTest{
	
	public static void main(String[] args){
		
		Address ad= new Address("Lahore","JT","Pakistan","ST-12","0314-7688987");
		
		Student std= new Student("Ali","35103-88355919",ad);
		
		Student std1= new Student("Jawad","35303-88375919",ad);
		
		System.out.println(std.getName());
		
		System.out.println(std.getAd().getTown());
		
		System.out.println(std.getAd().getCountry());
		
		System.out.println(std.getAd().getStreetAdress());
		
		System.out.println(std.getAd().getPhoneNumber());
		
		System.out.println("Data of Student 2");
		
		System.out.println(std1.getCnic());
		
	   System.out.println(std1.getName());
		
		System.out.println(std1.getAd().getTown());
		
		System.out.println(std1.getAd().getCountry());
		
		System.out.println(std1.getAd().getStreetAdress());
		
		System.out.println(std1.getAd().getPhoneNumber());
		
		System.out.println(std1.getCnic());
		
		
	}
	
	
	
	
}