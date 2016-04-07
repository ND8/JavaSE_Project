import java.util.Scanner;


public class CustomerDetails {
	public static int takeCustomerInput()
	{
		int NoofProduct;
	    
		Scanner customerdetailsInput = new Scanner(System.in);
		System.out.println("How many does the customer want to buy: ");
		NoofProduct = customerdetailsInput.nextInt();
		
		return NoofProduct;
	}

}
