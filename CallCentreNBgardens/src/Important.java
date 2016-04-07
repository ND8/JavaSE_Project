import java.util.Scanner;

public class Important {
	public static void main(String[] args)
	{
		int EmployeeID;
		double price;
		String full_name;
		String postcode;
		
		/*String nameofProduct; int Quantity;*/
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Employee ID = ");
		EmployeeID = userInput.nextInt();
		//System.out.println("EmployeeID = " + EmployeeID);
		
		price = productInfo();
		System.out.println("Price: " + price);
		
		
		//System.out.println("Customer First Name  = " + customerFirstName);
		String customerFirstName2;
		String customerLastName2;
		System.out.println("enter customer first name= ");
		customerFirstName2 = userInput.nextLine();
	
		
		System.out.println("enter customer last name= ");
		customerLastName2 = userInput.nextLine();
		full_name = customerFirstName2 + " " + customerLastName2;
		System.out.println("enter customer postcod= ");
		String postCode = userInput.nextLine();
		LocalDS.getLocalDataS().findCustomer(full_name, postCode);
		
		
	    
	}
	
	public static double productInfo()
	{
		double price = 0.0;
		String nameofProduct;
		int Quantity;		

		Customer customerproductinfo = new Customer();
		nameofProduct = customerproductinfo.takeCustomerInput();

		CustomerDetails productQuantity = new CustomerDetails();
		
		Quantity = productQuantity.takeCustomerInput();

		if (nameofProduct.equalsIgnoreCase("jacuzzi"))
		{
			Product jacuzzi = new Product("jacuzzi", 100, 999.50);
			System.out.println("New product: " + jacuzzi.name);
			
			jacuzzi.quantity = jacuzzi.quantity - Quantity;	
			price = jacuzzi.price;
			System.out.println("Jacuzzi quantity: " + jacuzzi.quantity);
		}
		else
		
			if (nameofProduct.equalsIgnoreCase("Gnome"))
			{
				Product Gnome = new Product("Gnome", 100, 35.00);
				System.out.println("New product: " + Gnome.name);
			
				Gnome.quantity = Gnome.quantity - Quantity;	
				price = Gnome.price;
				System.out.println("Gnome quantity: " + Gnome.quantity);
			}
			else
		
				if (nameofProduct.equalsIgnoreCase("spade"))
				{
					Product spade = new Product("spade", 100, 20.00);
					System.out.println("New product: " + spade.name);
			
					spade.quantity = spade.quantity - Quantity;
					price = spade.price;
					System.out.println("spade quantity: " + spade.quantity);
				}
				else
				{
					System.out.println("Product is unavailable");
				}
		
		return price;
	}
}

