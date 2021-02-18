package assignment3Problem1;

public class Customer {

	public String customerName;
	Address address;
	public Customer()
	{
		super();
	}
	public Customer(String customerName, Address address)
	{
		super();
		this.customerName = customerName;
		this.address = address;
	}
	public String getCustomerName()
	{
		return customerName;
	}
	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}
	public Address getAddress()
	{
		return address;
	}
	public void setAd(Address address)
	{
		this.address = address;
	}
	public void getCustomerDetails() {
		System.out.println("Customer:"+" "+customerName);
		System.out.println("Residential Address: "+address);
		
	}
}
