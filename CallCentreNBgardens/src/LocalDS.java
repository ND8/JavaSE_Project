import java.util.ArrayList;

public class LocalDS {
	private ArrayList<CustomerObject> customerlist = new ArrayList<CustomerObject>();
	private static LocalDS localDS = new LocalDS();
	
	private LocalDS()
	{
		customerlist.add(new CustomerObject("Sammy Adams", "1/1/1990", "BB1 7HA", " 30 london road"));
	}
	
	public static LocalDS getLocalDataS()
	{
		return localDS;
	}
	
	public void addcustomer(CustomerObject customerDetails) //changed from customerdetails1
	{
		customerlist.add(customerDetails); 					//changed from customerdetails1
	}
	
	public CustomerObject findCustomer(String name, String postCode){
		for(CustomerObject customer : customerlist)
		{
			if(customer.getFull_name().equalsIgnoreCase(name) && customer.getPostcode().equalsIgnoreCase(postCode))
			{
				System.out.println("Customer has been located and is registered");
				
				return null;
			}
			else
			{
				System.out.println("Customer not found, please register customer");
				
				return customer; 
			}
			
		}
		return null;
	}
}
