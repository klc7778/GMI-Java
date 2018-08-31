import java.util.List;

public class PrintInfo {
	
	public void printInfo(List<Product> products, String prodName)
	{
		boolean flag = false;
		
		// loop through the products in the array
		for(Product userProd:products)
		{
			if(userProd.getName().equals(prodName))
			{
				System.out.println("Product brand: " +userProd.getBrand() + " \n"
						+ " Product price " + userProd.getPrice());
				
				// set flag to true
				flag = true;
			} // end if statement to grab the product name here 
		} // end for loop here 
		
		// if user enters a product that is not in the list....
		if(flag == false)
		{
			System.out.println("Sorry, that product does not exist!");
		}
	} // end printInfo method
	
	public void checkProd(List<Product> products, List<String> request)
	{
		boolean flag = false;
		
		int quant = Integer.parseInt(request.get(1));
		
		// loop through the products in the array
		for(Product userProd:products)
		{
			if(userProd.getBrand().equals(request.get(0)))
			{
				if(quant <= userProd.getAvail_Stock())
				{
					System.out.println("Order placed!");
				} // end if statement for checking the quantity
				
				else
				{
					System.out.println("Out of stock!");
				} // end else statement 
				
				// set flag to true
				flag  = true;
			} // end if statement to grab the product name here 
			
			// if user enters a product that is not in the list....
			if(flag == false)
			{
				System.out.println("Sorry, that product does not exist!");
			}
		} // end for loop here 
	}

}
