import java.util.Scanner;


public class Customer {
	public static String takeCustomerInput()
	{
		Scanner customerInput = new Scanner(System.in);
		
		String customerFirstName;
		System.out.println("customer first name: ");
		customerFirstName = customerInput.nextLine();
														//System.out.println("Customer First Name  = " + customerFirstName);
		
		String customerLastName;
		System.out.println("customer last name: ");
		customerLastName = customerInput.nextLine();
														//System.out.println("Customer Last Name  = " + customerLastName);
		
		String dob;
		System.out.println("enter customer Date of Birth: ");
		dob = customerInput.nextLine();
		
		
		String postCode;
		System.out.println(" enter customer postcode: ");
		postCode = customerInput.nextLine();
														//System.out.println("Customer Post Code  = " + postCode);
		 
		String address;
		System.out.println("enter first line of address: ");
		address = customerInput.nextLine();
		 
	
		String productName;
		System.out.println("enter the product the customer would like to purchase: ");
		productName = customerInput.next();
														//System.out.println("Customer Product  = " + productName);
				
		
		String YesorNo;
		Boolean porousware = false;
		System.out.println("Does the customer want porousware?: ");
		YesorNo = customerInput.next();
		
		
		String PostCode;
		String FullName;
		
		CustomerObject customerDetails = new CustomerObject(customerFirstName + "  " + customerLastName, postCode, dob, address);
		
		if (YesorNo == "yes");
		{
			porousware = false;
		}
		
		
		return productName;
	}
		
}


