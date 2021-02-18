package assignment3Problem1;

public class TestCustomer {

	public static void main(String[] args) {
		
		
		Customer customer1=new Customer(); 
		customer1.setCustomerName("Akshay"); 
		Address address=new Address("Sedam","karnataka");
		
		
		System.out.println(customer1.getCustomerName());
		System.out.println(address.getStreetName()); 
		System.out.println(address.getCity());
		
		
		Customer customer2=new Customer(); 
		customer2.setCustomerName("sai"); 
		
	
		
		System.out.println();
		
		

		
		customer2.getCustomerDetails();
	   
		
		

	}

}
