import java.util.List;
import java.io.IOException;

interface CustomPrint{
	public boolean ifPrint(Product currProduct);
}

public class ProductSearch implements Runnable{
	
	String name;
	List<Product> products;
	
	public ProductSearch(String name)
	{
		super();
		this.name = name;
	}
	
	@Override
	public void run()
	{
		/*
		 * send the exact file of the path to the ProductReader class 
		 */
		ProductReader p = new ProductReader("C:\\Users\\kirclark\\Desktop\\Product_SuperStore.txt");
		
		try {
			products = p.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CustomPrint cp = (p3) -> ( p3.name.equals(name));
		
		printInfo(products,cp);
	} // end run method
	
	// create method to print product details
	public void printInfo(List<Product> products, CustomPrint cp)
	{
		boolean flag = false;
		for(Product currProduct : products)
		{
			if(cp.ifPrint(currProduct))
			{
				System.out.println(currProduct);
				flag = true;
			} // end if statement 
		} // end for loop here 
	} // end printInfo method

}
